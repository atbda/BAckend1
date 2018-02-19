package com.niit.DAO;

import com.niit.model.Supplier;

public interface SupplierDAO {
	
	public void addSupplier ( Supplier supplier);
	public void deleteSupplier (Supplier sd);	
	public void updateSupplier (Supplier su);	
	public void getSupplier (Supplier su);	

		
	}


