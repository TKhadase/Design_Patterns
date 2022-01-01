package com.tushar.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.tushar.utils.JDBC_Singleton;

public class DeSerialization_Test {

	public static void main(String[] args) throws Exception {
		System.out.println("DeSerialization.main( restricting_Serialization)");
		
		JDBC_Singleton jdbcObj1= JDBC_Singleton.getInstance();
		doSerialization(jdbcObj1);
		System.out.println("-----------------Serialization- completed-----------------------");
		JDBC_Singleton jdbcObj2 = (JDBC_Singleton) doDeSerialization();
		JDBC_Singleton jdbcObj3 = (JDBC_Singleton) doDeSerialization();
		System.out.println("-----------------DeSerialization- completed-----------------------");
		System.out.println("jdbcObj1:: "+jdbcObj1.hashCode());
		System.out.println("jdbcObj2:: "+jdbcObj2.hashCode());
		System.out.println("jdbcObj3:: "+jdbcObj3.hashCode());
		
	}//main
	
	public static void doSerialization(Object obj) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Obj.data"))){
			oos.writeObject(obj);//Serialization
			oos.flush();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}//doSerialization
	
	
	public static Object doDeSerialization() {
		Object  Obj =null;
		
		try(ObjectInputStream  ois = new ObjectInputStream(new FileInputStream("Obj.data"))){
			Obj = ois.readObject();//DeSerialization
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		return Obj;
	}//doDeSerialization
	
	
}//DeSerialization_Test
