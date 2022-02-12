package com.tushar.DAO.factory;

public class DAO_Factory_generator {

	public static DAO_Factory getDAOFactory(String type) {
		if(type.equalsIgnoreCase("MySQL"))
			return new MySQL_DAO_Config();
		else if(type.equalsIgnoreCase("Oracle"))
			return new Oracle_DAO_Config();
		else 
			throw new IllegalArgumentException("INVALID DATABASE SPECIFIED");
	}
	
}
