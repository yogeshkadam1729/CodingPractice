package com.practice.designPatterns.structural.decorator;

public class SugarDecorator extends CofeeDecorator{
    public SugarDecorator(Cofee cofee) {
        super(cofee);
    }

    @Override
    public String getDescription() {
        return decoratedCofee.getDescription()+", Sugar";
    }

    @Override
    public int getCost() {
        return decoratedCofee.getCost()+4;
    }
}
