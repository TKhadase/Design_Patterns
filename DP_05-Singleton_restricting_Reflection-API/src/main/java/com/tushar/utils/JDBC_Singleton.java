package com.tushar.utils;

public class JDBC_Singleton extends DemoSerializableClass{

	private static JDBC_Singleton INSTANCE;
	private static boolean isClassLoaded = false;
	
	private JDBC_Singleton() {
		if(isClassLoaded)
			throw new RuntimeException("Reflection is restricted for JDBC_Singleton ");
		else 
			isClassLoaded = true;
		
		System.out.println("JDBC_Singleton.JDBC_Singleton()  :: constructor");
	}
	
	public static JDBC_Singleton getInstance() {
		
		if(INSTANCE == null) {

			synchronized (JDBC_Singleton.class) //Multi-Threading issue
			{
				if(INSTANCE == null) {
					INSTANCE = new JDBC_Singleton();
				}//if(INSTANCE == null) 
			}//synchronized
			
		}//if(INSTANCE == null)
		return INSTANCE;
	}//getInstance()
	
	
	//to stop cloning process, return existing available reference
	@Override
	public Object clone() throws CloneNotSupportedException {
		return INSTANCE;
	}
	
	/*@Override
	public  Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException("Cloning is restricted for JDBC_Singleton ");
	}
	*/
	
	//to stop DeSerialization process, return existing available reference. readResolve() is internally called by readObject() 
	public Object readResolve() {
		System.out.println("JDBC_Singleton.readResolve()");
		return INSTANCE;
	}
	
	/*public Object readResolve() {
		System.out.println("JDBC_Singleton.readResolve()");
		 throw new IllegalArgumentException("DeSerialization is restricted for JDBC_Singleton ");
	}*/
	
	
}
