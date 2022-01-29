package com.stock.trading.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "stocks")
public class Stocks {
	
	@Id
	private Long stock_id;
	private String stock_name;
	private String price;
	public Stocks(Long stock_id, String stock_name, String price) {
		super();
		this.stock_id = stock_id;
		this.stock_name = stock_name;
		this.price = price;
	}
	public Stocks() {
		super();
	}
	public Long getStock_id() {
		return stock_id;
	}
	public void setStock_id(Long stock_id) {
		this.stock_id = stock_id;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [stock_id=" + stock_id + ", stock_name=" + stock_name + ", price=" + price + "]";
	}
	
	

}
