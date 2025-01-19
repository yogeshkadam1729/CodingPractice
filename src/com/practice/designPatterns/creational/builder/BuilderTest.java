package com.practice.designPatterns.creational.builder;

public class BuilderTest {
    

    public static void main(String args[]) {

        Computer computer = new Computer.ComputerBuilder("1TB","16GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        System.out.println(computer.isBluetoothEnabled());
    }
}
