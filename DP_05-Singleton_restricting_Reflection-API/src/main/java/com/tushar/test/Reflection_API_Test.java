package com.tushar.test;

import java.lang.reflect.Constructor;

import com.tushar.utils.JDBC_Singleton;

public class Reflection_API_Test {

	public static void main(String[] args) throws Exception {
		System.out.println("Reflection_API_Test.main( restricting_Reflection)");
		
		JDBC_Singleton jdbcObj1= JDBC_Singleton.getInstance();
		
		Class clazz = Class.forName("com.tushar.utils.JDBC_Singleton");
		Constructor cons[]=  clazz.getDeclaredConstructors();
		cons[0].setAccessible(true);// allow private constructor
		
		JDBC_Singleton jdbcObj2 = (JDBC_Singleton) cons[0].newInstance();
		JDBC_Singleton jdbcObj3 = (JDBC_Singleton)  cons[0].newInstance();
		
		System.out.println("jdbcObj1: "+jdbcObj1.hashCode());
		System.out.println("jdbcObj2: "+jdbcObj2.hashCode());
		System.out.println("jdbcObj3: "+jdbcObj3.hashCode());
		
	}//main
	
	
}//Reflection_API_Test
