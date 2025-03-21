package com.xworkz.autospare.seller.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.autospare.seller.entity.ProductEntity;
import com.xworkz.autospare.seller.entity.SellerRegisterEntity;
import com.xworkz.autospare.user.entity.UserSignupEntity;

@Component
public class SellerRepositoryImpl implements SellerRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean onSave(SellerRegisterEntity entity) {

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();

		return true;
	}

	@Override
	public SellerRegisterEntity findByEmail(String sellerEmail) {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SellerRegisterEntity> query = manager.createNamedQuery("findBySellerEmail",
				SellerRegisterEntity.class);
		query.setParameter("sellerEmail", sellerEmail);

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

	@Override
	public SellerRegisterEntity loginSeller(String email, int otp) {
		EntityManager manager = factory.createEntityManager();

		TypedQuery<SellerRegisterEntity> query = manager.createNamedQuery("loginSeller", SellerRegisterEntity.class);
		query.setParameter("sellerEmail", email);
		query.setParameter("otp", otp);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;

		}
	}

	@Override
	public boolean saveProduct(ProductEntity entity) {
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	@Override
	public List<ProductEntity> findBySellerId(int sellerId) {
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<ProductEntity> query = manager.createNamedQuery("findProductsBySellerId", ProductEntity.class);
		query.setParameter("sellerId", sellerId);
		
		try {
			return query.getResultList();
		}catch(Exception e) {			
			return null;
		}
	}

}
