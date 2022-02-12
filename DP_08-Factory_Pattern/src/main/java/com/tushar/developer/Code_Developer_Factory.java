package com.tushar.developer;

public class Code_Developer_Factory {

	public static Code_Developer getRequiredDeveloper(String type) {
		
		if(type.equalsIgnoreCase(Developer_Types.UI)) {
			return new UI_Developer();
		}
		else if(type.equalsIgnoreCase(Developer_Types.JAVA)) {
			return new JAVA_Developer();
		}
		else if(type.equalsIgnoreCase(Developer_Types.BACKEND)) {
			return new Backend_Developer();
		}
		else 
			throw new IllegalArgumentException("Invalid developer requirement");
	}
	
}
