package com.niit.ToysStoreBackendProject;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.DBConfig;
import com.niit.DAO.ProductDAO;
import com.niit.DAO.SupplierDAO;
import com.niit.model.Product;
import com.niit.model.Supplier;

public class TestDemo {
	public static void main(String []arg)
	{
		
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class);
	

	/*CategoryDAO categoryDAO=(CategoryDAO)context.getBean("category");
	
	Category category=new Category();
	category.setCategoryName("Toys");
	category.setCategoryDesc("Cars");
	
	categoryDAO.addCategory(category);
	*/

	ProductDAO productDAO=(ProductDAO)context.getBean("product");
	
	Product product=new Product();
	product.setProductName("Bat");
	product.setProductDesc("CrickettBat");
	product.setProductPrice(1200);
	product.setProductInStock(35);
	
	productDAO.addProduct(product);


	/*UserDAO userDAO=(UserDAO)context.getBean("user");
	
	User user=new User();
	
	user.setUserName("abcd");
	user.setPassword("abcd");
	user.setMobileNO(123456789);
	user.setUserAddress("Bangalore");
	
	
	
	userDAO.addUser(user);*/
	
	/*SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplier");
	Supplier supplier=new Supplier();
	
	supplier.setSupplierName("asdfgh");
	supplier.setSupplierMobileNO(12354689);
	supplier.setSupplierAddress("Bangalore");

	supplierDAO.addSupplier(supplier);

	
*/
	
     
	
	}
	}
