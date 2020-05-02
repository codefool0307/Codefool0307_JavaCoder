package com.codefool0307.impl;

import com.codefool0307.inter.Caculator;
import org.springframework.stereotype.Service;

@Service
public class MyCalculator implements Caculator {
    @Override
    public int add(int a, int b) {
        int c=a+b;
        return c;
    }
    @Override
    public int sub(int a, int b) {
        System.out.println("add方法要运行了");
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
}
