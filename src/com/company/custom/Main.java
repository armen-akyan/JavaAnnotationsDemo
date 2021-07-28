package com.company.custom;

import java.lang.reflect.Method;

@OurAnnotation
public class Main {

    public Main() {
    }

    @OurAnnotation2(dateCreated = "12 sep")
    public void method() throws NoSuchMethodException {
        Class<? extends Main> cls = this.getClass();
        Method mth = cls.getMethod("method");
        OurAnnotation2 myAnno = mth.getAnnotation(OurAnnotation2.class);
        System.out.println(myAnno.dateCreated() + ", " + myAnno.bln());
    }

    @OurAnnotation2(dateCreated = "12.07.21", bln = true)
    public static void main(@OurAnnotation String[] args) throws NoSuchMethodException {
        @OurAnnotation
        int k = 0;

        new Main().method();


    }
}
