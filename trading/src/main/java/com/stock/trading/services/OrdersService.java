package com.stock.trading.services;

import java.sql.Date;
import java.util.List;

import com.stock.trading.entities.Orders;

public interface OrdersService {

	public List<Orders> getOrders();


	public Orders addOrder(Orders order);


	public List<Orders> getAllOrders(Long user_id);


	public List<Orders> getOrdersByDate(Date fromDate, Date toDate);


	public List<Orders> getOrderStatus(String order_status);

	
	public void executeOrder();


	

}
