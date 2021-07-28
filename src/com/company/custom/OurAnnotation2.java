package com.company.custom;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface OurAnnotation2 {
    String dateCreated();

    boolean bln() default false;
}
