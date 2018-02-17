package com.niit.ToysStoreBackendProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.DBConfig;
import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

public class TestDemo {
	public static void main(String []arg)
	{
		
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class);
	
	
	CategoryDAO categoryDAO=(CategoryDAO)context.getBean("Cs");
	
	Category category=new Category();
	category.setCategoryName("Toys");
	category.setCategoryDesc("Doll");
	
	categoryDAO.addCategory(category);
	
	}
	}
