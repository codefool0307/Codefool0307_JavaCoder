package com.codefool0307.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
 @Autowired
    JdbcTemplate jdbcTemplate;
 /*
    减余额
  */
 public void updateBalance(String username,int price){
     String sql="update account set balance=balance-? where username=?";
     jdbcTemplate.update(sql,price,username);
 }
    /**
     * 2、按照图书的ISBN获取某本图书的价格
     */
    public int getPrice(String isbn){
        String sql = "SELECT price FROM book WHERE isbn=?";
        return jdbcTemplate.queryForObject(sql, Integer.class, isbn);
    }

    /**
     * 3、减库存；减去某本书的库存；为了简单期间每次减一
     */
    public void updateStock(String isbn){
        String sql = "UPDATE book_stock SET stock=stock-1 WHERE isbn=?";
        jdbcTemplate.update(sql, isbn);
    }

    public void updatePrice(String isbn,int price){
        String sql="update book set price=? where isbn=?";
        jdbcTemplate.update(sql,price,isbn);
    }

}
