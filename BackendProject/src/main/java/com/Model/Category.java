package com.Model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table
	public class Category {
	
		@Id
		@GeneratedValue
		private int categoryId;
		
		private String categoryName;
		private String cateogryDesc;
		
		public int getCategoryId() 
		{
			return categoryId;
		}
		public void setCategoryId(int categoryId) 
		{
			this.categoryId = categoryId;
		}
		public String getCategoryName() 
		{
			return categoryName;
		}
		public static void setCategoryName(String categoryName) 
		{
			this.categoryName = categoryName;
		}
		public String getCateogryDesc() 
		{
			return cateogryDesc;
		}
		public static void setCateogryDesc(String cateogryDesc) 
		{
			this.cateogryDesc = cateogryDesc;
		}
	}



