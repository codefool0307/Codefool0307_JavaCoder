package com.codefool0307.service;

import com.codefool0307.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;
     /*@Transactional(timeout = 3)*/
    /*@Transactional(noRollbackFor = ArithmeticException.class)*/
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void checkout(String username,String isbn){
         bookDao.updateStock(isbn);
         int price = bookDao.getPrice(isbn);
        /* try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }*/
        bookDao.updateBalance(username,price);
       /* int i=10/0;*/
    }
    @Transactional(readOnly = true)
    public int getPrice(String isbn){return bookDao.getPrice(isbn);}
    @Transactional(propagation = Propagation.REQUIRES_NEW,timeout = 2)
    public void updatePrice(String isbn,int price){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bookDao.updatePrice(isbn,price);
    }
    @Transactional
    public void mulTx(){
        checkout("Tom","ISBN-001");
        updatePrice("ISBN-001",998);
        int i=10/0;
    }
}
