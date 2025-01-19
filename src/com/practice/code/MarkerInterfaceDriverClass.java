package com.practice.code;

public class MarkerInterfaceDriverClass {
    public static  void main(String args[]) {
        MarkerInterfaceImpl object1 = new MarkerInterfaceImpl();
        JavaLockTest object2 = new JavaLockTest();

    }

    public static  boolean isValidMarkerClass(Object object) {
        if(object instanceof MarkerInterface) return true;
        return false;
    }
}
