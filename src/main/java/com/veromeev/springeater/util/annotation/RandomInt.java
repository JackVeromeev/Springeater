package com.veromeev.springeater.util.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by jack on 8/16/17.
 *
 * @author Jack Veromeyev
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface RandomInt {
    int min();
    int max();
}
