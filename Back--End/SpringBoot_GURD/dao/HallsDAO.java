package com.TKA.SpringBoot_GURD.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TKA.SpringBoot_GURD.entity.Halls;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
public class HallsDAO {
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public Halls saveHall(Halls hall) {
		entityManager.persist(hall);
		return hall;
	}
	
	
	public List<Halls> getAllHalls(){
		String jpql ="SELECT h FROM Halls h";
		TypedQuery<Halls> query=entityManager.createQuery(jpql,Halls.class);
		return query.getResultList();
	}
	
	  public Halls findHallById(Long id) {
	        return entityManager.find(Halls.class, id);
	    }

	    @Transactional
	    public void deleteHall(Halls hall) {
	        entityManager.remove(hall);
	    }
}
