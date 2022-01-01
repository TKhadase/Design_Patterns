package com.tushar.utils;

public class DAO  implements  Runnable {
	
	public void run() {
		JDBC_Singleton singletonObj = JDBC_Singleton.getInstance();
		System.out.println("DAO.run() singletonObj is ready : Hashcode:: "+singletonObj.hashCode());
	}

}
