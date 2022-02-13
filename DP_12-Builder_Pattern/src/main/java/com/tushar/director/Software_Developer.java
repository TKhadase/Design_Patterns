package com.tushar.director;

import com.tushar.builder.Software_Builder;
import com.tushar.product.Software;

public class Software_Developer {

	public Software_Builder builder =null;
	
	public Software_Developer(Software_Builder builder) {
	System.out.println("Software_Developer()");
	this.builder = builder;
	}
	
	private void build_Software() {
		System.out.println("build_Software()");
		builder.build_UI();
		builder.build_Backend();
	}
	
	public Software getSoftware() {
		build_Software();
		System.out.println("getSoftware()");
		return builder.build_Software();
	}
	
}
