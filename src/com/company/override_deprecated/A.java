package com.company.override_deprecated;

public class A {

    public void print() {
        System.out.println("hello from A");
    }

    @Deprecated(since = "15")
    public boolean smth(){
        return true;
    }
}

