package com.veromeev.springeater.quoter;

import com.veromeev.springeater.util.spring.postproxy.PostProxy;
import com.veromeev.springeater.util.spring.profiling.Profiling;
import com.veromeev.springeater.util.spring.randomizer.RandomInt;

import javax.annotation.PostConstruct;

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

    @PostProxy
    public void sayQuote() {
        for (int i = 0; i < repeats; i++) {
            System.out.println("quote = " + quote);
        }
    }
}
