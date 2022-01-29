package com.stock.trading.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.trading.entities.Stocks;

public interface StockDao extends JpaRepository<Stocks, Long> {

}
