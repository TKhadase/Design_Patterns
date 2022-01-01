package com.tushar.test;

import java.lang.reflect.Constructor;

import com.tushar.utils.DAO;
import com.tushar.utils.JDBC_Singleton;

public class Enum_Test {

	public static void main(String[] args) throws Exception {
		System.out.println("Enum_Test.main( restricting_Reflection)");
		JDBC_Singleton jdbcObj1= JDBC_Singleton.getInstance();
		System.out.println("jdbcObj1: "+jdbcObj1.hashCode());
		try {
		Class clazz = Class.forName("com.tushar.utils.JDBC_Singleton");
		Constructor cons[]=  clazz.getDeclaredConstructors();
		cons[0].setAccessible(true);// allow private constructor
		
		JDBC_Singleton jdbcObj2 = (JDBC_Singleton) cons[0].newInstance();
		JDBC_Singleton jdbcObj3 = (JDBC_Singleton)  cons[0].newInstance();
		
		
		System.out.println("jdbcObj2: "+jdbcObj2.hashCode());
		System.out.println("jdbcObj3: "+jdbcObj3.hashCode());
		}catch(Exception e) {
			System.out.println("Enum_Test.main() Exception: "+e);
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Enum_Test.main() Multi Threading");
		DAO d1 = new DAO();
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		Thread t3 = new Thread(d1);
		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(2000);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("-->  Clone()  is protected, Hence cannot call clone()");
		System.out.println("-->  DeSerialization  will return already available Singleton class object reference");
	}//main
	
	
}//Reflection_API_Test
