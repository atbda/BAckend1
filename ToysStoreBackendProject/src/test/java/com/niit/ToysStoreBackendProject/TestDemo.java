package com.niit.ToysStoreBackendProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.DBConfig;
import com.niit.DAO.CategoryDAO;
import com.niit.DAO.ProductDAO;
import com.niit.DAO.UserDAO;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.User;



public class TestDemo {
	public static void main(String []arg)
	{
		
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class);
	
	/*
	CategoryDAO categoryDAO=(CategoryDAO)context.getBean("Cs");
	
	Category category=new Category();
	category.setCategoryName("Toys");
	category.setCategoryDesc("Cars");
	
	categoryDAO.addCategory(category);
	

	ProductDAO productDAO=(ProductDAO)context.getBean("ps");
	
	Product product=new Product();
	product.setProductName("Ball");
	product.setProductDesc("BaskectBall");
	
	productDAO.addProduct(product);
*/

	UserDAO userDAO=(UserDAO)context.getBean("us");
	
	User user=new User();
	
	user.setUserName("abcd");
	user.setPassword("abcd");
	user.setMobileNO(123456789);
	user.setUserAddress("Bangalore");
	
	
	
	userDAO.addUser(user);
	
	}
	}
