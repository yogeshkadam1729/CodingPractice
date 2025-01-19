package com.practice.designPatterns.behavioural.chainOfResponsiblity;

public class Wire20mmDispenser implements  WireDispenser {

    private WireDispenser chain;

    @Override
    public void setNextChain(WireDispenser chain) {
        this.chain = chain;
    }

    @Override
    public void dispence(int totalWeight) {
        if (totalWeight >= 20) {
            int num = totalWeight / 20;
            int remainder = totalWeight % 20;
            System.out.println("Dispensing " + num + " 20mm wire");
            if (remainder != 0) this.chain.dispence(remainder);
        } else {
            this.chain.dispence(totalWeight);
        }
    }
}
