package com.stock.trading.services;

import org.springframework.stereotype.Service;

import com.stock.trading.MarketStatus;

@Service
public class MarketOpenCloseServiceImplementation implements MarketOpenCloseService {

	@Override
	public boolean getIsMarketOpen()
	{
		return MarketStatus.isMarketopen;
	}
	

	@Override
	public void updateIsMarketOpenOrClose(boolean isMarketOpen) {
		
		MarketStatus.isMarketopen=isMarketOpen;
		
	}
}
