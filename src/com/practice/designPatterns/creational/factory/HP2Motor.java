package com.practice.designPatterns.creational.factory;

import java.util.List;

public class HP2Motor implements Motor{
    @Override
    public String getMotorData() {
        return "this is the motor data for the 2 HP motor";
    }

    @Override
    public List<String> listOfManufactures() {
        return List.of("Bharat Bijali","philips");
    }
}
