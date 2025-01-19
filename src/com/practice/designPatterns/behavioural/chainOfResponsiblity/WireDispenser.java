package com.practice.designPatterns.behavioural.chainOfResponsiblity;

public interface WireDispenser {
    public void setNextChain(WireDispenser chain);
    public void dispence(int totalWeight);
}

