package com.practice.code;


public class TaxEntry {

    private String State;
    private String City;
    private int numEntries;
    private double price;

    public TaxEntry(String state, String city, int numEntries, double price) {
        State = state;
        City = city;
        this.numEntries = numEntries;
        this.price = price;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getNumEntries() {
        return numEntries;
    }

    public void setNumEntries(int numEntries) {
        this.numEntries = numEntries;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
