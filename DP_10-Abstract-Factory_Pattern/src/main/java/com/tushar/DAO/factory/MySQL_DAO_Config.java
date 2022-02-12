package com.tushar.DAO.factory;

import com.tushar.DAO.DAO;
import com.tushar.DAO.Exam_MySQL_DAO;
import com.tushar.DAO.Student_MySQL_DAO;

public class MySQL_DAO_Config implements DAO_Factory {

	@Override
	public DAO getDAO(String type) {
		if(type.equalsIgnoreCase("Student"))
			return new Student_MySQL_DAO();
		else if(type.equalsIgnoreCase("Exam"))
			return new Exam_MySQL_DAO();
		else 
			throw new IllegalArgumentException("INVALID DAO SPECIFIED");
	}

}
