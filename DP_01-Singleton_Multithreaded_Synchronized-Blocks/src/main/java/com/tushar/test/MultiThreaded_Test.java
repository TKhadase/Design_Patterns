package com.tushar.test;

import com.tushar.utils.DAO;

public class MultiThreaded_Test {

	public static void main(String[] args) {
		System.out.println("MultiThreaded_Test.main()");
		DAO dao  = new DAO();
		
		Thread t1 = new Thread(dao);
		Thread t2 = new Thread(dao);
		Thread t3 = new Thread(dao);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
