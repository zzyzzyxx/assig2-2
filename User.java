package com.assignement2;

public class User {

	
	private static String email;
	 private static String password;
	 private static String name;
	
	
	 //constructor
	 
	  User (String[] userData) {
		this.email = userData[0];
		this.password = userData[1];
		this.name = userData[2];
	}	
	  
	  
	  
	  
	 public static String getEmail() {
		 return email;
	 }
	 public static void setEmail(String email) {
		 User.email = email;
	 }
	 
	 public static String getPassword() {
		 return password;
	 }
	 public static void setPassword(String password) {
		 User.password = password;
	 }
	 
	 public static String getName() {
		 return name;
	 }
	 public static void setName(String name) {
		 User.name = name;
	 }
	 
	 String getInfo() {
		 return "Email: " + email+", Password: "+ password+", Name: "+name;
	 }
	

}
