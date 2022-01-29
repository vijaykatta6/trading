package com.stock.trading.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.stock.trading.entities.Stocks;
import com.stock.trading.services.StockService;

@RestController
public class StockController {

	@Autowired
	private StockService stockService;

	
	
	// get all user details
	
	@GetMapping("/stocks")
	public List<Stocks> getStock()
	{
		return this.stockService.getStocks();
	}
	
	// add the users into the database
	
	@PostMapping("/stocks")
	public Stocks addStock(@RequestBody Stocks stock)
	{
		return this.stockService.addStock(stock);
	}
	
}
