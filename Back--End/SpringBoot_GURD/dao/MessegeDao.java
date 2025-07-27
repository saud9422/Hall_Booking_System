package com.TKA.SpringBoot_GURD.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TKA.SpringBoot_GURD.entity.Messege;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transaction;

@Repository
public class MessegeDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void saveMessege(Messege messege) {
		Session ss = sessionFactory.openSession();
		org.hibernate.Transaction tr = ss.beginTransaction();
		ss.save(messege);
		tr.commit();
		sessionFactory.close();

	}

	public List<Messege> getAllmessege() {
		Session session = sessionFactory.openSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Messege> cq = cb.createQuery(Messege.class);
		Root<Messege> root = cq.from(Messege.class);
		CriteriaQuery<Messege> all = cq.select(root);
		TypedQuery<Messege> allQuery = session.createQuery(all);
		return allQuery.getResultList();

	}
}
