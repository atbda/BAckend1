package com.niit.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.SupplierDAO;
import com.niit.model.Product;
import com.niit.model.Supplier;

@Repository(value="supplier")

public class SupplierImpl implements SupplierDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	public void addSupplier(Supplier  supplier)
	
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();session.save(supplier);
		session.getTransaction().commit();
		session.close();
	}

	public void deleteSupplier(Supplier sd) {
		// TODO Auto-generated method stub
		
	}

	public void updateSupplier(Supplier su) {
		// TODO Auto-generated method stub
		
	}

	public void getSupplier(Supplier su) {
		// TODO Auto-generated method stub
		
	}


	
	

}
