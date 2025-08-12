package com.tvf.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 1. Reflection
 * 2. Serialization
 * 3. Cloning
 */
public class WaysToBreakSingletonPattern {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException, NoSuchMethodException, SecurityException {
	
		DBConnectionSynchronizedMethod instance1 = DBConnectionSynchronizedMethod.getInstance();
	
        // Get the private constructor
        Constructor<DBConnectionSynchronizedMethod> constructor = DBConnectionSynchronizedMethod.class.getDeclaredConstructor();
        
        // Make the constructor accessible
        constructor.setAccessible(true);
        
        // Create a new instance
        DBConnectionSynchronizedMethod instance2 = constructor.newInstance();
        
        System.out.println("Instance 1 hashCode: " + instance1.hashCode());
        System.out.println("Instance 2 hashCode: " + instance2.hashCode());
        System.out.println("Are they the same instance? " + (instance1 == instance2));
        // Output will show different hash codes and 'false'
         
	}
}
