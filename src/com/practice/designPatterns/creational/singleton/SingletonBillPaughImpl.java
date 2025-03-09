package com.practice.designPatterns.creational.singleton;

import java.io.Serializable;

public class SingletonBillPaughImpl implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;
    private SingletonBillPaughImpl () {}

    private static class InnerBillPughImpl {
        private static final SingletonBillPaughImpl INSTANCE = new SingletonBillPaughImpl();
    }

    public SingletonBillPaughImpl getInstance () {
        return InnerBillPughImpl.INSTANCE;
    }

    //use this method if the object and desrialize to produce same hashcode.
   /* readResolve() is marked as protected rather than private because:

    It allows subclasses to inherit or override the method.
    It ensures that the method is accessible to the Java serialization framework.
    It maintains controlled access to internal behavior while allowing necessary flexibility for inheritance.*/
    protected Object readResolve() {
        return getInstance();
    }

}
