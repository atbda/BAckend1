package com.Test;


	

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.CategoryDAO;
import com.Model.Category;

	
	public class DemoTest {
	
		public static void main(String arg[])
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com");
			context.refresh();
			
			CategoryDAO CategoryDAO=(CategoryDAO)context.getBean("CategoryDAO");
			
			Category category=new Category();
			Category.setCategoryName("Chimney");
			Category.setCateogryDesc("Hindware Chimney-Kitchen Decor");
			
			CategoryDAO.addCategory(category);
			
		}
	}


