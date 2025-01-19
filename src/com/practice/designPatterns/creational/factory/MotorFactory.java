package com.practice.designPatterns.creational.factory;

public class MotorFactory {

    public static Motor getMotor(Double hp) {
        if(hp == 1) return new HP1Motor();
        else if(hp == 2) return new HP2Motor();
        else return null;
    }
}
