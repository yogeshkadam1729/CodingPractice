package com.practice.designPatterns.creational.factory;

import java.util.List;

public class HP1Motor implements  Motor{

    @Override
    public String getMotorData() {
        return "this is the motor data for the 1 HP motor";
    }

    @Override
    public List<String> listOfManufactures() {
        return List.of("crompton","kirloskar");
    }
}
