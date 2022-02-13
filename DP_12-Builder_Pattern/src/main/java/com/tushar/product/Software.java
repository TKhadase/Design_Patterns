package com.tushar.product;

public class Software {

	private UI ui;
	private Backend backend;
	
	public UI getUi() {
		return ui;
	}
	
	public void setUi(UI ui) {
		this.ui = ui;
	}
	
	public Backend getBackend() {
		return backend;
	}
	
	public void setBackend(Backend backend) {
		this.backend = backend;
	}

	@Override
	public String toString() {
		return "Software [ui=" + ui + ", backend=" + backend + "]";
	}
	
	
}
