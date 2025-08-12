package com.tvf.design.pattern.creational.singleton;
/**
 * 
 * Advantages 
 * Thread-Safe: Guarantees a single instance in a multi-threaded environment.
 * Lazy Loading: The instance is only created when needed.
 * Disadvantages
 * Performance Overhead: The synchronized method can cause a performance bottleneck in high-concurrency scenarios because the lock is acquired on every call.
 * Reflection Attack Vulnerability: An attacker can use Java Reflection to bypass the private constructor and create a new instance.
 * Serialization Issues: Deserializing a serialized singleton can create a new instance, breaking the pattern. 
 * 
 */
public class DBConnectionSynchronizedMethod {
	private static DBConnectionSynchronizedMethod dbSynchronizedMethod=null;
	
	
	private DBConnectionSynchronizedMethod() {
		
	}
	
	public static synchronized DBConnectionSynchronizedMethod getInstance() {
		if(dbSynchronizedMethod==null) {
			dbSynchronizedMethod=new DBConnectionSynchronizedMethod();
		}
		return dbSynchronizedMethod;
	}
}
