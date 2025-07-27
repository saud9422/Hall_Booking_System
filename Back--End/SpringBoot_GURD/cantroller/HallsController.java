package com.TKA.SpringBoot_GURD.cantroller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TKA.SpringBoot_GURD.entity.Halls;
import com.TKA.SpringBoot_GURD.service.HallsService;
@CrossOrigin
@RequestMapping("/Halls")
@RestController
public class HallsController {
	@Autowired
	private HallsService service;
	
	@PostMapping("/save")
	public Halls saveHall(@RequestBody Halls hall) {
		System.out.println(hall);
		return service.addHall(hall);
		 
	}
	
	@GetMapping("/get")
	public List<Halls> getAllHalls(){
		return service.getAllHalls();
	}
	
	
	 @PostMapping("/delete")
	    public ResponseEntity<String> deleteHall(@RequestBody Map<String, Object> payload) {
	        try {
	            Long hallId = Long.valueOf(payload.get("hallId").toString());
	            boolean deleted = service.deleteHallById(hallId);

	            if (deleted) {
	                return ResponseEntity.ok("Hall with ID " + hallId + " deleted successfully.");
	            } else {
	                return ResponseEntity.status(404).body("Hall with ID " + hallId + " not found.");
	            }

	        } catch (Exception e) {
	            return ResponseEntity.badRequest().body("Invalid request: " + e.getMessage());
	        }
	    }
}
