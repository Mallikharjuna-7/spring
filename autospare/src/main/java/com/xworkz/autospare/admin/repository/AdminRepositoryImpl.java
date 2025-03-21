package com.xworkz.autospare.admin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.autospare.admin.entity.AdminEntity;
import com.xworkz.autospare.seller.entity.SellerRegisterEntity;
import com.xworkz.autospare.user.entity.UserSignupEntity;
import java.util.Collections;

@Component
public class AdminRepositoryImpl implements AdminRepository {

	@Autowired
	private EntityManagerFactory factory;

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

	@Override
	public List<UserSignupEntity> getAllUsers() {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<UserSignupEntity> query = manager.createNamedQuery("readAllUsers", UserSignupEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

	@Override
	public List<UserSignupEntity> getActiveUsers() {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<UserSignupEntity> query = manager.createNamedQuery("readActiveUsers", UserSignupEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

	@Override
	public List<UserSignupEntity> getInactiveUsers() {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<UserSignupEntity> query = manager.createNamedQuery("readInactiveUsers", UserSignupEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

	@Override
	public List<SellerRegisterEntity> getAllSellers() {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SellerRegisterEntity> query = manager.createNamedQuery("readAllSellers", SellerRegisterEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<SellerRegisterEntity> getApprovedSellers() {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SellerRegisterEntity> query = manager.createNamedQuery("readApprovedSellers",
				SellerRegisterEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<SellerRegisterEntity> getPendingSellers() {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SellerRegisterEntity> query = manager.createNamedQuery("readPendingSellers",
				SellerRegisterEntity.class);

		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public SellerRegisterEntity findById(int id) {
		
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SellerRegisterEntity> query = manager.createNamedQuery("findBySellerId", SellerRegisterEntity.class);
		query.setParameter("id", id);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean updateSeller(SellerRegisterEntity entity) {
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		
		return true;
	}

}
