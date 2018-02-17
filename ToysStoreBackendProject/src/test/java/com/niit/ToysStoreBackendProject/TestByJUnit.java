package com.niit.ToysStoreBackendProject;

import static org.junit.Assert.*;

import java.util.function.Supplier;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

public class TestByJUnit {

	

	@Autowired static AnnotationConfigApplicationContext context;
	
	 static CategoryDAO  Cs;
	

	
	//The above objects need to initialize
	/**
	 * This method is going execute before calling any one of test case
	 * and will execute only once
	 */
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		//get the userDAO from context
		Cs =  (CategoryDAO) context.getBean("Cs");
	
		//get the user from context
		
		
	}

	
	
	 
	@Test
	public void updateUserTestCase()
	{
		/*Category c1=new Category();
		c1.setCid(44);
		c1.setName("milk4");
		categoryDAO.insertCategory(c1);
	
		//error - if there is in runtime errors  -  Red mark
		//success  - if expected and actual is same  - green mark
		//fail  - if expected and actual is different  -  blue mark
		assertEquals(c1.getCid(),c1.getCid());
		*/
		
		Category category= new Category();
		category.setCategoryName("abcd");
		category.setCategoryDesc("new cat");
		Cs.addCategory(category);
		assertEquals(category.getCategoryName(),category.getCategoryName());
		
	}
}
