package com.stock.trading.services;

import java.util.List;

import com.stock.trading.entities.Stocks;

public interface StockService {

  	public List<Stocks> getStocks();

	public Stocks addStock(Stocks stock);
	
	
	

}
