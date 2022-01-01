package com.tushar.test;

import com.tushar.utils.JDBC_Singleton;

public class Cloning_Test {

	public static void main(String[] args) throws Exception {
		System.out.println("Cloning_Test.main( restricting_Cloning )");
		
		JDBC_Singleton jdbcObj1= JDBC_Singleton.getInstance();
		System.out.println("jdbcObj1:: "+jdbcObj1.hashCode());
		
		JDBC_Singleton  jdbcObj2 =(JDBC_Singleton) jdbcObj1.clone();
		System.out.println("jdbcObj2:: "+jdbcObj2.hashCode());
	}
	
}
