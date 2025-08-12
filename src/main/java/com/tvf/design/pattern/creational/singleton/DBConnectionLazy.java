package com.tvf.design.pattern.creational.singleton;

public class DBConnectionLazy {
	private static DBConnectionLazy dbConnectionLazy=null;
	
	private DBConnectionLazy() {
		
	}
	
	public static DBConnectionLazy getInstance() {
		if(dbConnectionLazy==null) {
			dbConnectionLazy=new DBConnectionLazy();
		}
		return dbConnectionLazy;
	}
}
