package com.example.junit.junit.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplTestWithMockAnnotation {
    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    public void testFindTheGreatestFromAllData() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{1,2,3});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(3,result);
    }

    @Test
    public void testOther() {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("something");
        assertEquals("something", listMock.get(0));
        assertEquals("something", listMock.get(1));

        //more any methob
    }
}
