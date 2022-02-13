package com.tushar.builder;

import com.tushar.product.Software;

public interface Software_Builder {

	public void build_UI();
	public void build_Backend();
	public Software build_Software();
	
}
