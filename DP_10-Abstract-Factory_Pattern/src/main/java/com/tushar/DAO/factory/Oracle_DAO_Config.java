package com.tushar.DAO.factory;

import com.tushar.DAO.DAO;
import com.tushar.DAO.Exam_MySQL_DAO;
import com.tushar.DAO.Exam_ORCL_DAO;
import com.tushar.DAO.Student_MySQL_DAO;
import com.tushar.DAO.Student_ORCL_DAO;

public class Oracle_DAO_Config implements DAO_Factory {


	@Override
	public DAO getDAO(String type) {
		if(type.equalsIgnoreCase("Student"))
			return new Student_ORCL_DAO();
		else if(type.equalsIgnoreCase("Exam"))
			return new Exam_ORCL_DAO();
		else 
			throw new IllegalArgumentException("INVALID DAO SPECIFIED");
	}

}
