package com.example.junit.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyMathTest {
    MyMath myMath = new MyMath();

    //MyMath.sum
    //1 => 1
    @Test
    public void sumWith1Number(){
        int result = myMath.sum(new int[]{1});
        //check result == 2
        assertEquals(1,result);
    }

    //MyMath.sum
    //1,2,3 => 6
    @Test
    public void sumWith3Number(){
        int result = myMath.sum(new int[]{1,2,3});
        //check result == 6
        assertEquals(6,result);
    }
}
