package com.niit.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

@Repository(value="Cs")
public class CategoryImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addCategory(Category ca) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save(ca);
session.getTransaction().commit();
session.close();
	
	}
	public void deleteCategory(Category cd) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save(cd);
session.getTransaction().commit();
session.close();
	
	}
	public void updateCategory(Category cu) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save(cu);
session.getTransaction().commit();
session.close();
	
	}
	public void getCategory(Category cg) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save(cg);
session.getTransaction().commit();
session.close();
	
	}

}