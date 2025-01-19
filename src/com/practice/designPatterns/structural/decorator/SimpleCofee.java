package com.practice.designPatterns.structural.decorator;

public class SimpleCofee implements Cofee{
    @Override
    public String getDescription() {
        return "simple cofee";
    }

    @Override
    public int getCost() {
        return 2;
    }
}
