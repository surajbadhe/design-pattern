package com.tvf.design.pattern.creational.singleton;

public class DBConnectionDoubleLocking {
	private static DBConnectionDoubleLocking connectionDoubleLocking=null;
	
	private DBConnectionDoubleLocking() {}
	
	public DBConnectionDoubleLocking getInstance() {
		if(connectionDoubleLocking==null) {
			synchronized (DBConnectionDoubleLocking.class) {
				if(connectionDoubleLocking==null) {
					connectionDoubleLocking=new DBConnectionDoubleLocking();
				}
			}
		}
		return connectionDoubleLocking;
	}
	
}
