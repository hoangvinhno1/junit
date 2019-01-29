package com.example.junit.junit.mockito;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl() {
    }

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData(){
        int [] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value: data){
            if(value > greatest){
                greatest = value;
            }
        }

        return greatest;
    }
}
