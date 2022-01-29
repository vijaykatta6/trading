package com.stock.trading.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.trading.entities.User;

public interface UserDao extends JpaRepository<User, Long> {

}
