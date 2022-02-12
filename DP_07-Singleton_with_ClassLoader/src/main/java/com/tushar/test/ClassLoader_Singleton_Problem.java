package com.tushar.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.tushar.utils.JDBC_Singleton;

public class ClassLoader_Singleton_Problem {

	public static void main(String[] args) {
	
	try{
		JDBC_Singleton singleton = JDBC_Singleton.getInstance();	
		System.out.println("currect proj class singleton hashCode:"+singleton.hashCode());
		System.out.println("currect proj class ClassLoader:"+singleton.getClass().getClassLoader());
		
		//load external jar using  URLClassLoader
		URLClassLoader loader = new URLClassLoader(new URL[] {new URL("File:\\E:\\c\\Design Patters JAVA\\SingletonClassLoaderTestJar.jar")}, null);//bnull for no parent class loader.
		
		//get Class & invoke method to get hashcode
		Class<?> clazz =loader.loadClass("com.tushar.utils.JDBC_Singleton");
		Method method = clazz.getDeclaredMethod("getInstance", new Class[] {});
		Object obj= method.invoke(null);
		System.out.println("URLClassLoader proj class singleton hashCode:"+obj.hashCode());
		
		
	}//try
	catch(Exception e) {
		e.printStackTrace();
	}
	}

}
