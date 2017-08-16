package com.veromeev.springeater.quoter;

import com.veromeev.springeater.util.annotation.Profiling;
import com.veromeev.springeater.util.annotation.RandomInt;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;

/**
 * Created by jack on 8/15/17.
 *
 * @author Jack Veromeyev
 */

@Profiling
public class TerminatorQuoter implements Quoter {

    @RandomInt(min = 3, max = 10)
    private int repeats;

    private String quote;

    public TerminatorQuoter() {
        System.out.println("Constructor. repeats = " + repeats + " class = " + getClass());
    }

    @PostConstruct
    public void init() {
        System.out.println("Init.        repeats = " + repeats + " class = " + getClass());
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }


    public void sayQuote() {
        for (int i = 0; i < repeats; i++) {
            System.out.println("quote = " + quote);
        }
    }
}
