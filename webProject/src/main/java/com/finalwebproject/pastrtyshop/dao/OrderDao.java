package com.finalwebproject.pastrtyshop.dao;

import com.finalwebproject.pastrtyshop.entity.Client;
import com.finalwebproject.pastrtyshop.entity.Order;
import com.finalwebproject.pastrtyshop.entity.OrderStatus;

import java.util.Date;
import java.util.List;

public interface OrderDao extends BaseDao<Order>{
    List<Order> findById (int orderId);
    List<Order> findByOrderDate (Date orderDate);
    List<Order> findByTotalPrice (double totalPrice);
    List<Order> findByClient (Client client);
    List<Order> findByOrderStatus (OrderStatus orderStatus);
    List<Order> findByInWhatDate (Date inWhatDate);
    List<Order> findByFirstName (String firstName);
    List<Order> findBySecondName (String secondName);
    List<Order> findByPhoneNumber (String phoneNumber);

    boolean updateOrderDate (Date orderDate, int orderId);
    boolean updateTotalPrice (double totalPrice, int orderId);
    boolean updateClient (Client client, int orderId);
    boolean updateOrderStatus (OrderStatus orderStatus, int orderId);
    boolean updateInWhatDate (Date inWhatDate, int orderId);
    boolean updateFirstName (String firstName, int orderId);
    boolean updateSecondName (String secondName, int orderId);
    boolean updatePhoneNumber (String phoneNumber, int orderId);

}
