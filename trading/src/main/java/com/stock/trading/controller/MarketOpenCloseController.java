package com.stock.trading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stock.trading.MarketStatus;
import com.stock.trading.services.MarketOpenCloseService;
import com.stock.trading.services.MarketOpenCloseServiceImplementation;

@RestController
public class MarketOpenCloseController {
	
	@Autowired
	private MarketOpenCloseService marketService;
	
	@GetMapping("/ismarketopen")
	public boolean marketStatus()
	{
		return this.marketService.getIsMarketOpen();
	}
	
	@PostMapping("/saveMarket")
	public void saveMarket(@RequestParam(name = "isMarketOpen") boolean isMarketOpen)
	{
		this.marketService.updateIsMarketOpenOrClose(isMarketOpen);
	}

}
