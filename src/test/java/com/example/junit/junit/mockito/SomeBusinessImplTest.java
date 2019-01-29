package com.example.junit.junit.mockito;
import org.junit.*;
import static org.junit.Assert.assertEquals;
public class SomeBusinessImplTest {
    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(3,result);
    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3};
    }
}
