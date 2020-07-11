package com.assignement2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class Service {
	
	public static User[] users = new User[4];
	
	public static void readFile() {
	String[] userData = null;
	BufferedReader reader = null;
	
		
		
		
	   
		
	try {
		reader = new BufferedReader(new FileReader("data.txt"));
		
		String line;	
		int i = 0;
		
		
		while((line = reader.readLine())!= null) {
				
				
				userData = line.split(",");
				users[i] = new User(userData);
//				System.out.println("Users"+i+": "+users[i].getInfo());
//				System.out.println("Usersemail"+i+": "+users[i].getEmail());
//				System.out.println("Userspassword"+i+": "+users[i].getPassword());
//				System.out.println("Usersname"+i+": "+users[i].getName());
				i++;
				}

				
		
		
	} catch (FileNotFoundException e) {
		System.out.println("File Not Found");
		e.printStackTrace();
	} catch  (IOException e) {
		System.out.println("IO Exception");
		e.printStackTrace();
	}
	finally {
		try {
			System.out.println("Closing the reader");
			reader.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	}
}


