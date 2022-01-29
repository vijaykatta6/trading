package com.stock.trading.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity(name="orders")
public class Orders {
	
	@Id
	private Long order_id;
	private Long stock_id;
	private Long user_id;
	private String order_type;
	private String order_status;
	private Date date;
	private String order_quantity;
	private Float price;
	
	
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stock_id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Stocks stock;
	
	public Stocks getStock() {
		return stock;
	}
	public void setStock(Stocks stock) {
		this.stock = stock;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private User user;

	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getStock_id() {
		return stock_id;
	}
	public void setStock_id(Long stock_id) {
		this.stock_id = stock_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	
	 public Date getDate()
	 { 
		 return date; 
		 } 
	 public void setDate(Date date)
	 {
	  this.date = date;
	  }
	 
	public String getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(String order_quantity) {
		this.order_quantity = order_quantity;
	}
	
	public Orders() {
		super();
	}
	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", stock_id=" + stock_id + ", user_id=" + user_id + ", order_type="
				+ order_type + ", order_status=" + order_status + ",  order_quantity="
				+ order_quantity + "]";
	}
	
	
	
	
	
	

}
