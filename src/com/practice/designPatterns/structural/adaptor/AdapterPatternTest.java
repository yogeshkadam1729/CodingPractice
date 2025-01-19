package com.practice.designPatterns.structural.adaptor;

public class AdapterPatternTest {

    public static void main(String args[]) {
        CurrentAdapter currentAdapter = new CurrentAdapter();
        System.out.println("Testing the Adapter for : "+currentAdapter.test3vEquipment());
        System.out.println("Testing the Adapter for : "+currentAdapter.test12vEquipment());
        System.out.println("Testing the Adapter for : "+currentAdapter.test120vEquipment());
    }
}

