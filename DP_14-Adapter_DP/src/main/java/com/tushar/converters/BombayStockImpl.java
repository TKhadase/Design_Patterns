package com.tushar.converters;

import java.util.Random;

import com.tushar.adapter.StockNameConverter;

public class BombayStockImpl implements IBombayStock {

	@Override
	public int getStockPrice(String name) {
		
		StockNameConverter converter = new StockNameConverter();
		int stockID = converter.getStockID(name);
		
		//Business Logic to get Stock value
		int value =stockID + (new Random().nextInt(1000));
		
		return value;
	}

}
