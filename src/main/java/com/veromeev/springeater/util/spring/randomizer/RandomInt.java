package com.veromeev.springeater.util.spring.randomizer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Use on int and Integer of castable to int fields to inject random integer
 * value from {@code min} to {@code max} params
 * For use you should create {@link RandomIntAnnotationBeanPostProcessor} bean
 * in your spring context.
 * @author Jack Veromeyev
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface RandomInt {
    int min();
    int max();
}
