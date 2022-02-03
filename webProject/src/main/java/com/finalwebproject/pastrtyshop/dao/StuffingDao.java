package com.finalwebproject.pastrtyshop.dao;

import com.finalwebproject.pastrtyshop.entity.Stuffing;

import java.util.List;

public interface StuffingDao extends BaseDao<Stuffing>{
    List<Stuffing> findById(int stuffingId);
    List<Stuffing> findByStuffing(String stuffing);

    boolean updateStuffing(String stuffing, int stuffingId);
    boolean updateDescription(String description, int stuffingId);
}
