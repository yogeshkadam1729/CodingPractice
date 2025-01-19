package com.practice.designPatterns.behavioural.chainOfResponsiblity;

public class WireMachine {
    private WireDispenser c1;

    public WireMachine() {
        c1 = new Wire50mmDispenser();
        WireDispenser c2 = new Wire20mmDispenser();
        WireDispenser c3 = new Wire10mmDispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String args []) {
        WireMachine wireMachine = new WireMachine();
        int totalWieght = 580;
        wireMachine.c1.dispence(totalWieght);
    }
}

