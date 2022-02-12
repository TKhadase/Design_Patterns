package com.tushar.developer.factory;

import com.tushar.developer.Backend_Developer;
import com.tushar.developer.Code_Developer;
import com.tushar.developer.Developer_Types;
import com.tushar.developer.JAVA_Developer;
import com.tushar.developer.UI_Developer;

public abstract class Dev_Factory {

	public abstract boolean checkQualification();

	public abstract boolean checkEligibility();

	public Code_Developer getRequiredDeveloper(String type) {
		if (checkQualification() && checkEligibility()) {

			Code_Developer dev = null;
			if (type.equalsIgnoreCase(Developer_Types.UI)) {
				dev = new UI_Developer();
			} else if (type.equalsIgnoreCase(Developer_Types.JAVA)) {
				dev = new JAVA_Developer();
			} else if (type.equalsIgnoreCase(Developer_Types.BACKEND)) {
				dev = new Backend_Developer();
			} else
				throw new IllegalArgumentException("Invalid developer requirement");

			dev.coding();
			dev.buildingProject();
			dev.TestingProject();
			return dev;
		}//checkQualification() && checkEligibility()
		else {
			throw new IllegalArgumentException("Please Check  Qualification & Eligibility");
		}
	}

}
