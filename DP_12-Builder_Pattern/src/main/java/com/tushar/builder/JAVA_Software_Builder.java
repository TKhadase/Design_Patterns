package com.tushar.builder;

import com.tushar.product.Angular;
import com.tushar.product.Oracle_Backend;
import com.tushar.product.Software;

public class JAVA_Software_Builder implements Software_Builder {

	private Software software;
	
	public JAVA_Software_Builder() {
	 System.out.println("JAVA_Software_Builder");
	 software =new Software();
	}
	
	@Override
	public void build_UI() {
	System.out.println("JAVA_Software_Builder.build_UI()");
	software.setUi(new Angular());
	}

	@Override
	public void build_Backend() {
		System.out.println("JAVA_Software_Builder.build_Backend()");
		software.setBackend(new Oracle_Backend());
	}

	@Override
	public Software build_Software() {
		return software;
	}

}
