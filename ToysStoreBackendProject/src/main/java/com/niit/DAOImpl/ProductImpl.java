package com.niit.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;

@Repository(value="ps")

public class ProductImpl  implements ProductDAO {
		@Autowired
		SessionFactory sessionFactory;

		public void addProduct(Product p) {

			Session session=sessionFactory.openSession();
	session.beginTransaction(); session.save(p);
	session.getTransaction().commit();
	session.close();
		
		}
}
