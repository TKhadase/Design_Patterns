package com.tushar.courier;

import java.util.HashMap;
import java.util.Map;

public class CourierFactory<T extends Courier> {

	private static Map<String, Courier> map = new HashMap<>();
	
	public static <T extends Courier> T getCourierInstance(String vendor, Class<T> vendorClass) throws Exception {
		
		if(!map.containsKey(vendor)) {
			map.put(vendor, (T) vendorClass.getDeclaredConstructors()[0].newInstance(null));
		}
		return (T) map.get(vendor);
		
	}//getCourierInstance
	
}//class
