package com.TKA.SpringBoot_GURD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TKA.SpringBoot_GURD.dao.HallsDAO;
import com.TKA.SpringBoot_GURD.entity.Halls;

@Service
public class HallsService {
	@Autowired	
	private HallsDAO halldao;
	

	public Halls addHall(Halls hall) {
		return halldao.saveHall(hall);
		
	}
	
	public List<Halls> getAllHalls(){
		return halldao.getAllHalls();
	}
	
	 public boolean deleteHallById(Long id) {
	        Halls hall = halldao.findHallById(id);
	        if (hall != null) {
	            halldao.deleteHall(hall);
	            return true;
	        }
	        return false;
	    }
	
}
