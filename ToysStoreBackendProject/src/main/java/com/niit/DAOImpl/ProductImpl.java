	package com.niit.DAOImpl;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.niit.DAO.ProductDAO;
	import com.niit.model.Product;

	@Repository(value="ps")

	public class ProductImpl  implements ProductDAO 
	{
			@Autowired
			SessionFactory sessionFactory;

			public void addProduct(Product pa) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.save(pa);
		session.getTransaction().commit();
		session.close();
			
			}
			
		

			public void deleteProduct(Product pd) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.save(pd);
		session.getTransaction().commit();
		session.close();
			
			}

			public void updateProduct(Product pu) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.save(pu);
		session.getTransaction().commit();
		session.close();
			
			}

			@Override
			public void getProduct(Product pg) {
			
				
			}
	
	
	}


