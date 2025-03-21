package com.xworkz.autospare.user.repository;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.autospare.seller.entity.ProductEntity;
import com.xworkz.autospare.user.entity.UserSigninEntity;
import com.xworkz.autospare.user.entity.UserSignupEntity;

@Component
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean onSave(UserSignupEntity entity) {

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}
	
	@Override
	public UserSignupEntity getEmail(String email) {

		EntityManager manager = factory.createEntityManager();

		TypedQuery<UserSignupEntity> query = manager.createNamedQuery("findEmail", UserSignupEntity.class);
		query.setParameter("email", email);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public UserSignupEntity getAadhar(String aadhar) {

		EntityManager manager = factory.createEntityManager();

		TypedQuery<UserSignupEntity> query = manager.createNamedQuery("findAadhar", UserSignupEntity.class);
		query.setParameter("aadhar", aadhar);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public UserSignupEntity getContact(String contact) {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<UserSignupEntity> query = manager.createNamedQuery("findContact", UserSignupEntity.class);
		query.setParameter("contact", contact);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public UserSignupEntity authenticateUser(String email, String password) {

		EntityManager manager = factory.createEntityManager();

		TypedQuery<UserSignupEntity> query = manager.createNamedQuery("authentication", UserSignupEntity.class);
		query.setParameter("email", email);
		query.setParameter("password", password);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;

		}
	}

	@Override
	public boolean signInSave(UserSigninEntity entity) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();

		return false;
	}
	
	@Override
	public boolean updateByEmail(UserSignupEntity entity) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();

		return true;
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		
		EntityManager manager = factory.createEntityManager();

		TypedQuery<ProductEntity> query = manager.createNamedQuery("readAllProducts", ProductEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

}
