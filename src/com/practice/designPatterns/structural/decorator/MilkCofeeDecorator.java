package com.practice.designPatterns.structural.decorator;

public class MilkCofeeDecorator extends CofeeDecorator{

    public MilkCofeeDecorator(Cofee cofee) {
        super(cofee);
    }
    @Override
    public String getDescription() {
        return decoratedCofee.getDescription()+", Milk";
    }

    @Override
    public int getCost() {
        return decoratedCofee.getCost()+2;
    }
}
