package net.javaguides.springboot.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Pole;
import net.javaguides.springboot.repository.PoleRepository;

@RestController
//@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class PoleController {

	@Autowired
	private PoleRepository PoleRepository;
	
	// get all employees
	@GetMapping("/getPoles")
	public List<Pole> getAllpole(){
		return PoleRepository.findAll();
	}		
	
	// create employee rest api
	/*@PostMapping("/createPole")
	public Pole createPole(@RequestBody Pole Pole) {
		return PoleRepository.save(Pole);
	}*/
	@PostMapping("/createPole")
    public void process(@RequestBody com.fasterxml.jackson.databind.JsonNode payload) {
        // Convert JsonNode to a string (assuming jsonData is a field in your entity)   	
        String pole_material = payload.get("pole_material").asText();
        double pole_lat = payload.get("pole_lat").asDouble();
        double pole_lon = payload.get("pole_lon").asDouble();
        String pole_remarks = payload.get("pole_remarks").asText();
            
        // Create a Pole object and save it to the database
         Pole pole = new Pole();
         pole.setpole_material(pole_material);
         pole. setpole_lat(pole_lat);
         pole.setpole_lon(pole_lon);
         pole.setpole_remarks(pole_remarks);
        PoleRepository.save(pole);
    }
 
	
	

	
	
	
//	// get pole by id rest api
	@GetMapping("/pole/{id}")
	public ResponseEntity<Pole> getPoleById(@PathVariable Long id) {
		Pole pole = PoleRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pole not exist with id :" + id));
		return ResponseEntity.ok(pole);
}
	
	// update pole rest api
	
	@PutMapping("/pole/{id}")
	public ResponseEntity<Pole> updatePole(@PathVariable Long id, @RequestBody Pole poleDetails){
		Pole pole = PoleRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pole not exist with id :" + id));
		
		pole.setpole_material(poleDetails.getpole_material());
		pole.setpole_lat(poleDetails.getpole_lat());
		pole.setpole_lon(poleDetails.getpole_lon());
   	pole.setpole_remarks(poleDetails.getpole_remarks());
		
		Pole updatedPole = PoleRepository.save(pole);
		return ResponseEntity.ok(updatedPole);
	}
	
	// delete pole rest api
	@DeleteMapping("/pole/{id}")
	public ResponseEntity<Map<String, Boolean>> deletePole(@PathVariable Long id){
		Pole pole = PoleRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pole not exist with id :" + id));
		
		PoleRepository.delete(pole);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}