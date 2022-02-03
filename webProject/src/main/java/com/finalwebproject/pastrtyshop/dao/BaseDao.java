package com.finalwebproject.pastrtyshop.dao;

import com.finalwebproject.pastrtyshop.entity.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface BaseDao <T extends Entity>{
    List<T> findAll();
    boolean delete(T t);
    boolean create(T t);
  //  T update(T t);

    default void closeConnection(Connection connection) {
        try {
            if (connection != null){
                connection.close();
            }
        }catch (SQLException e){
            // log
            // fixme
        }
    }

    default void closeStatement(Statement statement){
        try {
            if (statement != null){
                statement.close();
            }
        }catch (SQLException e){
            // log
            // fixme
        }
    }


}
