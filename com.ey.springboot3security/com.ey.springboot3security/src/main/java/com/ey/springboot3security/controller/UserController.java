package com.ey.springboot3security.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.ey.springboot3security.entity.AuthRequest; 
import com.ey.springboot3security.entity.UserInfo;
import com.ey.springboot3security.repository.UserInfoRepository;
import com.ey.springboot3security.service.JwtService;
import com.ey.springboot3security.service.UserInfoDetails;
import com.ey.springboot3security.service.UserInfoService;

import jakarta.servlet.http.HttpServletResponse;
import com.ey.springboot3security.service.ExcelService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize; 
import org.springframework.security.authentication.AuthenticationManager; 
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken; 
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;



@RestController
@RequestMapping("/auth") 
@CrossOrigin("*")
//@CrossOrigin(origins = "https://localhost:3000/", allowedHeaders = "*")
public class UserController { 

	@Autowired
	private UserInfoService service; 

	@Autowired
	private UserInfoRepository repository; 
	
	@Autowired
	private JwtService jwtService; 
	
	@Autowired
	private ExcelService dataExportService;
	
	@Autowired
	private AuthenticationManager authenticationManager; 

    
	
	
	@GetMapping("/welcome") 
	public String welcome() { 
		return "Welcome this endpoint is not secure"; 
	} 
	
	@PostMapping("/addNewUser") 
	public String addNewUser(@RequestBody UserInfo userInfo) { 
		return service.addUser(userInfo); 
	} 

	
		  
		  @GetMapping("/findUser/{username}")
		  public ResponseEntity<Map<String, Boolean>> checkUserExists(@PathVariable String username) {
		      try {
		          Optional<UserInfo> userDetail = repository.findByName(username);
		          Optional<UserInfoDetails> dataExists = userDetail.map(UserInfoDetails::new);

		          Map<String, Boolean> response = new HashMap<>();
		          response.put("userExists", dataExists.isPresent());

		          return ResponseEntity.ok(response);
		      } catch (Exception e) {
		          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", true));
		      }
		  }
		  
		  
		  

		  
	 @PostMapping("/upload")
	    //@PreAuthorize("hasRole('USER')")
	    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
	        if (!file.isEmpty()) {
	            try {
	                // Define the directory where you want to save the file
	                String uploadDir ="D:\\demo\\";
	          

	                // Create the directory if it doesn't exist
	                File directory = new File(uploadDir);
	                if (!directory.exists()) {
	                    directory.mkdirs();
	                }

	                // Save the file to the specified directory
	                //String filePath = uploadDir + file.getOriginalFilename();
	                //file.transferTo(new File(filePath));
	                String filePath = Paths.get(uploadDir, file.getOriginalFilename()).toString();
	                file.transferTo(new File(filePath));
	                // You can perform additional processing here if needed

	                return ResponseEntity.ok("File uploaded successfully. Path: " + filePath);
	            } catch (IOException e) {
	                e.printStackTrace();
	                return ResponseEntity.badRequest().body("File upload failed");
	            }
	        } else {
	            return ResponseEntity.badRequest().body("File is empty");
	        }
	    }
	
	
	
	
	@GetMapping("/excel")
	//@PreAuthorize("hasAuthority('ROLE_OTHERS')") 
	public void exportToExcel(HttpServletResponse response) throws IOException {
		List<UserInfo> data = dataExportService.getAllData();

		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		response.setHeader("Content-Disposition", "attachment; filename=data.xls");

		// Use a library like Apache POI to generate the Excel file
		// Example using Apache POI HSSF:
		try (HSSFWorkbook workbook = new HSSFWorkbook()) {
			HSSFSheet sheet = workbook.createSheet("User");

			// Create header row
			HSSFRow headerRow = sheet.createRow(0);
			headerRow.createCell(0).setCellValue("Id");
			headerRow.createCell(1).setCellValue("Name");
			headerRow.createCell(2).setCellValue("Roles");

			// Populate data rows
			int rowNum = 1;
			for (UserInfo entity : data) {
				HSSFRow row = sheet.createRow(rowNum++);
				row.createCell(0).setCellValue(entity.getId());
				row.createCell(1).setCellValue(entity.getName());
				row.createCell(2).setCellValue(entity.getRoles());
				//row.createCell(3).setCellValue(entity.getpole_lon());
				//row.createCell(4).setCellValue(entity.getpole_remarks());
			}

			workbook.write(response.getOutputStream());
		}
	}


	@GetMapping("/user/userProfile") 
    @PreAuthorize("hasAuthority('ROLE_OTHERS')") 
	public String userProfile() { 
		return "Welcome to User Profile"; 
	} 

	@GetMapping("/admin/adminProfile") 
//   @PreAuthorize("hasAuthority('ROLE_ADMIN')") 
	public String adminProfile() { 
		return "Welcome to Admin Profile"; 
	} 

//	@PostMapping("/generateToken") 
//	public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) { 
//		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())); 
//		System.out.println(authRequest.getUsername());
//		if (authentication.isAuthenticated()) { 
//			return jwtService.generateToken(authRequest.getUsername()); 
//		} else { 
//			throw new UsernameNotFoundException("invalid user request !"); 
//		} 
//	} 
	
	@PostMapping("/generateToken") 
	public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) { 
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())); 
		if (authentication.isAuthenticated()) { 
			return jwtService.generateToken(authRequest.getUsername()); 
		} else { 
			throw new UsernameNotFoundException("invalid user request !"); 
		} 
	} 

} 
