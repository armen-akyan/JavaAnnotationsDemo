package com.company.override_deprecated;

import com.company.override_deprecated.A;

public class Main {

    public static void main(String[] args) {
        A a = new A();

        @SuppressWarnings(value = "all")
        boolean bln = a.smth();
    }

}
