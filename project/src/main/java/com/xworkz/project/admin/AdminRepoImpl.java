package com.xworkz.project.admin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminRepoImpl implements AdminRepo {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean adminSave(AdminEntity entity) {

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();

		return true;
	}

	@Override
	public AdminEntity authenticateAdmin(String adminEmail, String password) {

		EntityManager manager = factory.createEntityManager();

		TypedQuery<AdminEntity> query = manager.createNamedQuery("adminAuthentication", AdminEntity.class);
		query.setParameter("adminEmail", adminEmail);
		query.setParameter("password", password);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

}
