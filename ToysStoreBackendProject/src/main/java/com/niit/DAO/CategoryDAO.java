package com.niit.DAO;

import com.niit.model.Category;

public interface CategoryDAO 
  {
	public void addCategory (Category ca);
	public void deleteCategory (Category cd);
	public void updateCategory (Category cu);
	public void getCategory (Category cg);
	}
