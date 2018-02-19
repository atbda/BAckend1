package com.niit.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.UserDAO;
import com.niit.model.Product;
import com.niit.model.User;


	


	@Repository(value="user")

	public  class UserImpl  implements UserDAO 
	
	{
		
			@Autowired
			SessionFactory sessionFactory;
			public void addUser(User user) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.save(user);
		session.getTransaction().commit();
		session.close();
			
			}

			public void deleteUser(int uid) {

				Session session=sessionFactory.openSession();
		 session.beginTransaction(); 
		User u=session.get(User.class, uid);
		
		session.delete(u);
		session.getTransaction().commit();
		session.close();
			
			}

			public void updateUser(User uid) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.update(uid);
		session.getTransaction().commit();
		session.close();
			
			}

			public void getUser(User uid) {
			
				
			}
	
	


			
			

}
