package com.codefool0307.Service;
import com.codefool0307.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarDao carDao;

    public void save(){
        System.out.println("正在调用Dao为您保存图书");
        carDao.saveBook();
    }
}
