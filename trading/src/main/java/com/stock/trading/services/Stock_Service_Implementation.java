package com.stock.trading.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.trading.dao.StockDao;
import com.stock.trading.entities.Stocks;

@Service
public class Stock_Service_Implementation implements StockService {
	
	
	@Autowired
	private StockDao stockDao;

	@Override
	public List<Stocks> getStocks() {
		
		return stockDao.findAll();
	}

	@Override
	public Stocks addStock(Stocks stock) {
	    stockDao.save(stock);
		return stock;
	}

	

}


