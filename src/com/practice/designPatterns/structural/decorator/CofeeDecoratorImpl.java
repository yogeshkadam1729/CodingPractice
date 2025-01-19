package com.practice.designPatterns.structural.decorator;

public class CofeeDecoratorImpl {

    public static void main(String args[]) {
        Cofee cofee = new SimpleCofee();
        System.out.println(cofee.getDescription());
        System.out.println(cofee.getCost());
        cofee = new MilkCofeeDecorator(cofee);
        System.out.println(cofee.getDescription());
        System.out.println(cofee.getCost());
        cofee = new SugarDecorator(cofee);
        System.out.println(cofee.getDescription());
        System.out.println(cofee.getCost());
        Cofee mixcofee = new SimpleCofee();
        mixcofee = new SugarDecorator(new MilkCofeeDecorator(mixcofee));
        System.out.println(mixcofee.getDescription());
        System.out.println(mixcofee.getCost());
    }
}
