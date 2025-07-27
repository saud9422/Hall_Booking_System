package com.TKA.SpringBoot_GURD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TKA.SpringBoot_GURD.dao.MessegeDao;
import com.TKA.SpringBoot_GURD.entity.Messege;
@Service
public class MessegeService {
	@Autowired
	private MessegeDao dao;
	public void save(Messege messege) {
		dao.saveMessege(messege);
	}
	
	public List<Messege> getAllmessege(){
		
		return dao.getAllmessege();
	}
	
}
