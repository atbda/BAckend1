package com.niit.DAO;

import com.niit.model.Product;

public interface ProductDAO {

	public void addProduct (Product pa);
	public void deleteProduct (Product pd);	
	public void updateProduct (Product pu);	
	public void getProduct (Product pu);	

	
}
