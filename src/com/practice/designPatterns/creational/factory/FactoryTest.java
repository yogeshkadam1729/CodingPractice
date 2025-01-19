package com.practice.designPatterns.creational.factory;

public class FactoryTest {

    public static void main(String args []) {
        System.out.println(MotorFactory.getMotor(1d).getMotorData());
        System.out.println(MotorFactory.getMotor(2d).getMotorData());
    }
}
