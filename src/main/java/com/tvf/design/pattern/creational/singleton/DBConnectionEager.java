package com.tvf.design.pattern.creational.singleton;

/**
 * Singleton design pattern is used when we have to create only one instance of a class
 * There are 4 ways to achieve this 
 * 1- Eager 
 * 2- lazy 
 * 3- Synchronized Method 
 * 4- Double Locking  
 */
//Eager 
public class DBConnectionEager {
	private static DBConnectionEager db=new DBConnectionEager();
	
	private DBConnectionEager() {
		
	}
	
	public static DBConnectionEager getConnection() {
		return db;
	}
	
}


