package com.codefool0307.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MulService {
    @Autowired
    private BookService bookService;
    @Transactional
    public void multx(){
        bookService.checkout("Tom","ISBN-001");
        bookService.updatePrice("ISBN-001",998);
    }
}
