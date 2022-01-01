package com.tushar.utils;

public class JDBC_Singleton {

	private JDBC_Singleton() {
		System.out.println("JDBC_Singleton.JDBC_Singleton()  :: constructor");
	}
	
	private static class JDBC_SingletonInner {
		private static JDBC_Singleton INSTANCE = new JDBC_Singleton() ; // inner class based lazy instatiation
	} 
	
	public static JDBC_Singleton getInstance() {
		return JDBC_SingletonInner.INSTANCE;
	}
	
}
