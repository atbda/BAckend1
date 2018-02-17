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

}
