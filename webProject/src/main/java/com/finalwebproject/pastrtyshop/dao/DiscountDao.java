package com.finalwebproject.pastrtyshop.dao;

import com.finalwebproject.pastrtyshop.entity.ClientDiscount;

import java.util.List;

public interface DiscountDao extends BaseDao <ClientDiscount>{

    List<ClientDiscount> findById(int discountId);
    List<ClientDiscount> findByValue(double value);
    List<ClientDiscount> findByNameOfDiscount(String nameOfDiscount);

    boolean updateValue(double value, int discountId);
    boolean updateDiscountName(String nameOfDiscount, int discountId);
}
