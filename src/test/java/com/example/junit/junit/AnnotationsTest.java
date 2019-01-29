package com.example.junit.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class AnnotationsTest {
    MyMath myMath = new MyMath();

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }

    //MyMath.sum
    //1 => 1
    @Test
    public void sumWith1Number(){
        System.out.println("test 1");
        int result = myMath.sum(new int[]{1});
        //check result == 2
        assertEquals(1,result);
    }

    //MyMath.sum
    //1,2,3 => 6
    @Test
    public void sumWith3Number(){
        System.out.println("test 2");
        int result = myMath.sum(new int[]{1,2,3});
        //check result == 6
        assertEquals(6,result);
    }
}
