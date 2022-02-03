package com.finalwebproject.pastrtyshop.dao;

import com.finalwebproject.pastrtyshop.entity.Dessert;

import java.util.List;

public interface DessertDao extends BaseDao<Dessert>{
    List<Dessert> findById(int dessertId);
    List<Dessert> findByCost(double cost);
    List<Dessert> findByName(String name);
    List<Dessert> findByType(String type);

    boolean updateCost(double cost, int dessertId);
    boolean updateDescription(String description, int dessertId);
    boolean updateName(String name, int dessertId);
    boolean updateType(String type, int dessertId);
}
