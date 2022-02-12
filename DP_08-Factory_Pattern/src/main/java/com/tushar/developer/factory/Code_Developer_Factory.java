package com.tushar.developer.factory;

import com.tushar.developer.Backend_Developer;
import com.tushar.developer.Code_Developer;
import com.tushar.developer.Developer_Types;
import com.tushar.developer.JAVA_Developer;
import com.tushar.developer.UI_Developer;

public class Code_Developer_Factory {

	public static Code_Developer getRequiredDeveloper(String type) {
		Code_Developer dev =null;
		if(type.equalsIgnoreCase(Developer_Types.UI)) {
			dev= new UI_Developer();
		}
		else if(type.equalsIgnoreCase(Developer_Types.JAVA)) {
			dev=  new JAVA_Developer();
		}
		else if(type.equalsIgnoreCase(Developer_Types.BACKEND)) {
			dev=  new Backend_Developer();
		}
		else 
			throw new IllegalArgumentException("Invalid developer requirement");
		
		dev.coding();
		dev.buildingProject();
		dev.TestingProject();
		return dev;
	}
	
}
