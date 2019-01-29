package com.example.junit.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertTest {

    @Test
    public void test(){
        assertEquals(1,1);
        assertNotEquals(1,2);
        assertArrayEquals(new int[]{1}, new int[1]);
        assertTrue(true);
        assertFalse(false);
        assertNotNull(null);
        assertNull(null);
    }
}
