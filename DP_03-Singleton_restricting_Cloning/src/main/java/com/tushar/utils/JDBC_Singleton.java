package com.tushar.utils;

public class JDBC_Singleton {

	private static JDBC_Singleton INSTANCE;
	
	private JDBC_Singleton() {
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
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return INSTANCE;
	}
	
	/*@Override
	public  Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException("Cloning is restricted for JDBC_Singleton ");
	}
	*/
}
