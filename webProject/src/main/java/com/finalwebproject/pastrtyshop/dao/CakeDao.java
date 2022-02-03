package com.finalwebproject.pastrtyshop.dao;

import com.finalwebproject.pastrtyshop.entity.Cake;
import com.finalwebproject.pastrtyshop.entity.Stuffing;

import java.util.List;

public interface CakeDao extends BaseDao<Cake> {
    int createWithId(Cake cake);

    List<Cake> findById(int id);
    List<Cake> findByCost(double cost);
    List<Cake> findByWeight(double weight);
    List<Cake> findByStuffing(Stuffing stuffing);

    boolean updateCost(double cost, int cakeId);
    boolean updateWeight(double weight, int cakeId);
    boolean updateStuffing(Stuffing stuffing, int cakeId);
    boolean updateDesignDescription(String description, int cakeId);
}
