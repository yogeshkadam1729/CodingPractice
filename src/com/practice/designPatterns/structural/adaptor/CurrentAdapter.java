package com.practice.designPatterns.structural.adaptor;

public class CurrentAdapter implements  TestRunner {


    Socket socket = new Socket();


    @Override
    public int test3vEquipment() {
        return socket.getVolt()/40;
    }

    @Override
    public int test12vEquipment() {
        return socket.getVolt()/10;
    }

    @Override
    public int test120vEquipment() {
        return socket.getVolt();
    }

    private int convertVolt(int baseVolt,int conversionFactor) {
        return baseVolt/conversionFactor;
    }
}

