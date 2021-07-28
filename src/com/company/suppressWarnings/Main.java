package com.company.suppressWarnings;

import com.company.override_deprecated.A;

// all, cast, classfile, deprecation, dep-ann, divzero, empty, fallthrough,
// finally, options, overrides, path, processing, rawtypes, serial, static,
// try, unchecked, varargs, unused

//@SuppressWarnings(value = "all")
public class Main<T> {

    public void main(String[] args) {
        int y = 0;
        int k = 7;

        @SuppressWarnings("unused")
        int u = 8;
        @SuppressWarnings(value = "unchecked")
        T o = (T) new A();
        @SuppressWarnings(value = "divzero")
        int r = k / y;
    }

}
