package com.tushar.factory;

import com.tushar.builder.JAVA_Software_Builder;
import com.tushar.builder.NET_Software_Builder;
import com.tushar.builder.PHP_Software_Builder;
import com.tushar.builder.Software_Builder;
import com.tushar.director.Software_Developer;
import com.tushar.product.Software;

public class Software_Factory {

	public static Software getSoftware(String type) {
		 Software software =null;
		 Software_Builder builder =null;
		
		 if(type.equalsIgnoreCase("JAVA")) {
			 builder = new JAVA_Software_Builder();
		 }
		 else  if(type.equalsIgnoreCase("PHP")) {
			 builder = new PHP_Software_Builder();
		 } 
		 else  if(type.equalsIgnoreCase(".NET")) {
			 builder = new NET_Software_Builder();
		 }
		 else throw new IllegalArgumentException("INVALID TEHNOLOGY SPECIFIED");
		
		 Software_Developer developer = new Software_Developer(builder);
		 software = developer.getSoftware();
		return software;
	}
	
}
