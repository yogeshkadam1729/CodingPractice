package com.practice.designPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class AvailableServices implements  Cloneable {
    private List<String> services;

    public AvailableServices() {
        services = new ArrayList<>();
    };

    public AvailableServices(List<String> services) {
        this.services = services;
    }

    public List<String> getServices() { return this.services;}
    public void loadData() {
        services.addAll(List.of("test1","test2","test3"));
    }

    public Object clone() {
            List<String> temp = new ArrayList<>();
            temp.addAll(this.services);
            return new AvailableServices(temp);

    }

}
