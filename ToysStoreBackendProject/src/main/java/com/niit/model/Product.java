	package com.niit.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;



	@Entity
	@Table
	public class Product {
		


			@Id
			@GeneratedValue
			private int ProductID;
			private String  ProductName;
			private String  ProductDesc;
			
			public int getProductID() {
				return ProductID;
			}
			public void setProductID(int productID) {
				ProductID = productID;
			}
			public String getProductName() {
				return ProductName;
			}
			public void setProductName(String productName) {
				ProductName = productName;
			}
			public String getProductDesc() {
				return ProductDesc;
			}
			public void setProductDesc(String productDesc) {
				ProductDesc = productDesc;
			}
			
			

	}


