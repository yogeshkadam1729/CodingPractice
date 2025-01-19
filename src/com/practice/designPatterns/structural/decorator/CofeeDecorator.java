package com.practice.designPatterns.structural.decorator;

public class CofeeDecorator implements Cofee{

    protected Cofee decoratedCofee;
    public CofeeDecorator(Cofee cofee) {
        this.decoratedCofee = cofee;
    }
    @Override
    public String getDescription() {
        return decoratedCofee.getDescription();
    }

    @Override
    public int getCost() {
        return decoratedCofee.getCost();
    }
}
