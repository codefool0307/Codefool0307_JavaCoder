package com.codefool0307.Service;

import com.codefool0307.dao.BaseDao;
import com.codefool0307.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
    @Autowired
    BaseDao<T> baseDao;
    public void save(){
        baseDao.save();
    }
}
