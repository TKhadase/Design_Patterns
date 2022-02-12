package com.tushar.DAO.factory;

import com.tushar.DAO.DAO;

public interface DAO_Factory {
	
	public DAO  getDAO(String type);

}
