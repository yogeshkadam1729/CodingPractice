package com.practice.designPatterns.creational.prototype;

public class ProtoTypeTest {
    public static void main(String args[]) {
        AvailableServices services = new AvailableServices();
        services.loadData();
        AvailableServices services1 = (AvailableServices) services.clone();
        services1.getServices().add("test4");
        AvailableServices services2 = (AvailableServices) services.clone();
        services2.getServices().add("test5");
        System.out.println(services.getServices());
        System.out.println(services1.getServices());
        System.out.println(services2.getServices());
    }
}
