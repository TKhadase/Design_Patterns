package com.tushar.adapter;

public class StockNameConverter {

	public int getStockID(String sName) {
		int stockNum = 00;

		//Business Logic to get StockID
		if (sName.equalsIgnoreCase("SAMSUNG"))
			stockNum = 111;
		else if (sName.equalsIgnoreCase("NOKIA"))
			stockNum = 222;
		else if (sName.equalsIgnoreCase("MI"))
			stockNum = 333;
		else throw new IllegalArgumentException("Invalid Stock Name:"+sName);
		
		return stockNum;
	}

}
