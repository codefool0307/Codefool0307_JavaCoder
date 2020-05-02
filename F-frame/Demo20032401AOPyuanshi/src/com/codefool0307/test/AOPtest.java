package com.codefool0307.test;
import com.codefool0307.impl.MyCalculator;
import com.codefool0307.inter.Caculator;
import org.junit.Test;
public class AOPtest {
    @Test
    public void testpriormethod(){
        Caculator c = new MyCalculator();
        int add = c.add(2, 3);
        int add1 = c.add(7, 9);
    }
}
