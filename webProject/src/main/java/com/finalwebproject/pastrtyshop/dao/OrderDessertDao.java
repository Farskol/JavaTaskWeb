package com.finalwebproject.pastrtyshop.dao;

import com.finalwebproject.pastrtyshop.entity.Cake;
import com.finalwebproject.pastrtyshop.entity.Dessert;
import com.finalwebproject.pastrtyshop.entity.Order;
import com.finalwebproject.pastrtyshop.entity.OrderDessert;

import java.util.List;

public interface OrderDessertDao extends BaseDao<OrderDessert>{
    List<OrderDessert> findById (int OrderDessertId);
    List<OrderDessert> findByCount (int count);
    List<OrderDessert> findByOrder (Order order);
    List<OrderDessert> findByCake (Cake cake);
    List<OrderDessert> findByDessert (Dessert dessert);

    boolean updateCount (int count, int orderDessertId);
    boolean updateOrder (Order order, int orderDessertId);
    boolean updateCake (Cake cake, int orderDessertId);
    boolean updateDessert (Dessert dessert, int orderDessertId);

}
