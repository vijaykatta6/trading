package com.stock.trading.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.trading.MarketStatus;
import com.stock.trading.dao.OrdersDao;
import com.stock.trading.entities.Orders;

@Service
public class Orders_Service_implementation implements OrdersService {
	
	@Autowired
	private OrdersDao ordersDao;
// 1
	@Override
	public List<Orders> getOrders() {
		
		return ordersDao.findAll();
	}

	
	
	
//2	
	@Override
	public Orders addOrder(Orders order) {
		if(MarketStatus.isMarketopen == true)
		{
			// default order status is pending
			order.setOrder_status("pending");
	      ordersDao.save(order);
		  return order;
		}
		else
		{
			return null;
		}
	}

	
//3	
	@Override
	public List<Orders> getAllOrders(Long user_id) {
		
		return ordersDao.getAllOrders(user_id);
	}

	
//4	
	@Override
	public List<Orders> getOrdersByDate(Date fromDate, Date toDate) {
		
		return ordersDao.getOrdersByDate(fromDate, toDate);
	}

	
//5	
	@Override
	public void executeOrder() {
		ordersDao.executeOrders();
	}

	
//6	
	@Override
	public List<Orders> getOrderStatus(String order_status) {
		
		return ordersDao.getOrderStatus(order_status);
	}

	
	
	

}
