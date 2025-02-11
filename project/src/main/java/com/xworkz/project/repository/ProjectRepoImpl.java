package com.xworkz.project.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.entity.SignInEntity;

@Component
public class ProjectRepoImpl implements ProjectRepo {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean onSave(SignUpEntity entity) {

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

	@Override
	public SignUpEntity authenticateUser(String email, String password) {

		EntityManager manager = factory.createEntityManager();

		TypedQuery<SignUpEntity> query = manager.createNamedQuery("authentication", SignUpEntity.class);
		query.setParameter("email", email);
		query.setParameter("password", password);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;

		}
	}

	@Override
	public boolean signInSave(SignInEntity entity) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();

		return false;
	}

	@Override
	public SignUpEntity getEmail(String email) {

		EntityManager manager = factory.createEntityManager();

		TypedQuery<SignUpEntity> query = manager.createNamedQuery("findEmail", SignUpEntity.class);
		query.setParameter("email", email);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public SignUpEntity getAadhar(String aadhar) {

		EntityManager manager = factory.createEntityManager();

		TypedQuery<SignUpEntity> query = manager.createNamedQuery("findAadhar", SignUpEntity.class);
		query.setParameter("aadhar", aadhar);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public SignUpEntity getContact(String contact) {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SignUpEntity> query = manager.createNamedQuery("findContact", SignUpEntity.class);
		query.setParameter("contact", contact);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean updateByEmail(SignUpEntity entity) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();

		return true;
	}

	@Override
	public List<SignUpEntity> getActiveUsers() {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SignUpEntity> query = manager.createNamedQuery("readActive", SignUpEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<SignUpEntity> getInactiveUsers() {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SignUpEntity> query = manager.createNamedQuery("readInactive", SignUpEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<SignUpEntity> getAllUsers() {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SignUpEntity> query = manager.createNamedQuery("readAll", SignUpEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

}
