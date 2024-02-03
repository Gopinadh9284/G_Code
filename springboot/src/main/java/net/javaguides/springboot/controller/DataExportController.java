package net.javaguides.springboot.controller;

import java.io.IOException;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;
import net.javaguides.springboot.ExcelService;
import net.javaguides.springboot.model.Pole;

@RestController
@CrossOrigin("*")
public class DataExportController {
	@Autowired
	private ExcelService dataExportService;

	@GetMapping("/excel")
	public void exportToExcel(HttpServletResponse response) throws IOException {
		List<Pole> data = dataExportService.getAllData();

		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		response.setHeader("Content-Disposition", "attachment; filename=data.xls");

		// Use a library like Apache POI to generate the Excel file
		// Example using Apache POI HSSF:
		try (HSSFWorkbook workbook = new HSSFWorkbook()) {
			HSSFSheet sheet = workbook.createSheet("Pole");

			// Create header row
			HSSFRow headerRow = sheet.createRow(0);
			headerRow.createCell(0).setCellValue("poleid");
			headerRow.createCell(1).setCellValue("pole_material");
			headerRow.createCell(2).setCellValue("pole_lat");
			headerRow.createCell(3).setCellValue("pole_lon");
			headerRow.createCell(4).setCellValue("pole_remarks");

			// Populate data rows
			int rowNum = 1;
			for (Pole entity : data) {
				HSSFRow row = sheet.createRow(rowNum++);
				row.createCell(0).setCellValue(entity.getpoleid());
				row.createCell(1).setCellValue(entity.getpole_material());
				row.createCell(2).setCellValue(entity.getpole_lat());
				row.createCell(3).setCellValue(entity.getpole_lon());
				row.createCell(4).setCellValue(entity.getpole_remarks());
			}

			workbook.write(response.getOutputStream());
		}
	}

}
