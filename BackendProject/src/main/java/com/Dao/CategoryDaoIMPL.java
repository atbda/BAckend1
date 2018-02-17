package com.Dao;




	import javax.transaction.Transactional;

	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

import com.Model.Category;




	@Repository("CategoryDAO")
	public class CategoryDaoIMPL  implements CategoryDAO 
	{

		@Autowired
		SessionFactory sessionFactory;
		
		
		@Transactional
		@Override
		public boolean addCategory(Category category) 
		{	
			sessionFactory.getCurrentSession().save(category);
			return false;
		}

	}



