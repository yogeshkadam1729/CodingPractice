package com.practice.designPatterns.behavioural.chainOfResponsiblity;

public class Wire10mmDispenser implements WireDispenser{
    private WireDispenser chain;
    @Override
    public void setNextChain(WireDispenser chain) {
        this.chain = chain;
    }

    @Override
    public void dispence(int totalWeight) {
        if(totalWeight >= 10){
            int num = totalWeight/10;
            int remainder = totalWeight % 10;
            System.out.println("Dispensing "+num+" 10mm wire");
            if(remainder !=0) this.chain.dispence(remainder);
        }else{
            this.chain.dispence(totalWeight);
        }
    }
}

