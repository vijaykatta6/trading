package com.stock.trading.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.transaction.annotation.Transactional;

import com.stock.trading.entities.Orders;

public interface OrdersDao extends JpaRepository<Orders, Long> {
//	
//	String listAllOrdersQuery="SELECT "
//			+ "* "
//			+ "FROM orders "
//			+ "JOIN "
//			+ "user ON "
//			+ "orders.user_id=user.user_id "
//			+ "JOIN stocks on "
//			+ "orders.stock_id = stocks.stock_id";
//	
 
	@Query(value="from orders where user_id=?1")
	List<Orders> getAllOrders(Long user_id);
	
	
	
	
	@Query(value="from orders where date between ?1 and ?2")
	List<Orders> getOrdersByDate(Date fromDate, Date toDate);
	
	
	@Query(value="from orders where order_status=?1")
	List<Orders> getOrderStatus(String order_status);
//	
//    @Transactional
//	@Modifying(clearAutomatically = true)
////	@Query("update orders set order_status=if(order_type='market' or (order_type='limit' and price>(select price from stocks where stock_id=orders.stock_id)),'completed','rejected')")
//	@Query("update orders set order_status=IF((order_type='market'),'completed','rejected')")
//    void executeOrders();
    
    @Procedure(procedureName = "EXECUTE_ORDER")
    void executeOrders();
    
	
	
}
