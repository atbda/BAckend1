package com.niit.DAO;

import com.niit.model.User;



public interface UserDAO {
		public void addUser (User  ua);
		public void deleteUser  (int uid);	
		public void updateUser  (User  uu);	
		public void getUser  (User  ug);	

		

}
