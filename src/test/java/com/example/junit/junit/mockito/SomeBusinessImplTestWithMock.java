package com.example.junit.junit.mockito;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplTestWithMock {
    @Test
    public void testFindTheGreatestFromAllData() {
        DataService dataService = mock(DataService.class);
//        dataService.retrieveAllData() => new int[]{1,2,3};
        when(dataService.retrieveAllData()).thenReturn(new int[]{1,2,3});

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataService);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(3,result);
    }
}
