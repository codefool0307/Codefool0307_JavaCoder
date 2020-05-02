package com.codefool0307.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao {
   public void saveBook(){
      System.out.println("图书已经保存了");
   }
}
