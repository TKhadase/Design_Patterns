package com.tushar.builder;

import com.tushar.product.ASP;
import com.tushar.product.Oracle_Backend;
import com.tushar.product.SQL_SERVER_Backend;
import com.tushar.product.Software;

public class NET_Software_Builder implements Software_Builder {

	private Software software;
	
	public NET_Software_Builder() {
	 System.out.println("NET_Software_Builder");
	 software =new Software();
	}
	
	@Override
	public void build_UI() {
	System.out.println("NET_Software_Builder.build_UI()");
	software.setUi(new ASP());
	}

	@Override
	public void build_Backend() {
		System.out.println("NET_Software_Builder.build_Backend()");
		software.setBackend(new SQL_SERVER_Backend());
	}

	@Override
	public Software build_Software() {
		return software;
	}

}
