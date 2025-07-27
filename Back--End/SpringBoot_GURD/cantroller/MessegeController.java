package com.TKA.SpringBoot_GURD.cantroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TKA.SpringBoot_GURD.entity.Messege;
import com.TKA.SpringBoot_GURD.service.MessegeService;
@CrossOrigin
@RequestMapping("/Messege")
@RestController
public class MessegeController {
	@Autowired
	private MessegeService service;
	
	@PostMapping("/save")
	public void save (@RequestBody Messege messege) {
		System.out.println(messege);
		service.save(messege);
	}
	
	
	
	@GetMapping("/get")
	public List<Messege> getAllmessege(){
		return service.getAllmessege();
	}
}
