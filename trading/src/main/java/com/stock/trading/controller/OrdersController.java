package com.stock.trading.controller;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stock.trading.entities.Orders;
import com.stock.trading.services.OrdersService;

@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	
	@GetMapping("/orders")
	public List<Orders> getOrder()
	{
		return this.ordersService.getOrders();
	}
	
	@GetMapping("/ordersbyuser")
	public List<Orders> getAllOrders(@RequestParam Long user_id)
	{
		return this.ordersService.getAllOrders(user_id);
	}
	
	
	
	@PostMapping("/orders")
	public Orders addOrder(@RequestBody Orders order)
	{
		
		return this.ordersService.addOrder(order);
	}
	
	
	 
	@GetMapping("/ordersbetweendate")
	public List<Orders> getOrdersByDate(@RequestParam("fromDate") String fromDate, String toDate)
	{
		
		System.out.println(dateConvertStrToSQL(toDate));
		return this.ordersService.getOrdersByDate(dateConvertStrToSQL(fromDate), dateConvertStrToSQL(toDate));
		
	}
	
	
	@GetMapping("/orderstatus")
	public List<Orders> getOrderStatus(@RequestParam String order_status)
	{
		return this.ordersService.getOrderStatus(order_status);
	}
	
	
	//execute orders
	// no params 
	@PostMapping("/executeorders")
	public String executeOrders()
	{
		this.ordersService.executeOrder();
		return "executed";
		
	}
	
	
	
	public Date dateConvertStrToSQL(String date){
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		 java.sql.Date sqlDate = null ;
		    try {
		        java.util.Date utilDate = format.parse(date);
		        
		        sqlDate= new java.sql.Date(utilDate.getTime());
		        System.out.println(sqlDate);
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    
		    return sqlDate;
	}

}
