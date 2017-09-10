package com.veromeev.springeater.util.spring.deprecatedclass;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedClass {
    Class newImplementation();
}
