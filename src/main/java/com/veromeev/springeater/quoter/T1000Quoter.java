package com.veromeev.springeater.quoter;

import com.veromeev.springeater.util.spring.postproxy.PostProxy;
import com.veromeev.springeater.util.spring.profiling.Profiling;

/**
 * Class for updating deprecated {@link TerminatorQuoter} class
 */

/*
 * Note: this class should implement Quoter interface despite it was
 * implemented in parent class. Profiling functionality needs this for creating
 * proxy instance of this class correctly.
 */

@Profiling
public class T1000Quoter extends TerminatorQuoter implements Quoter {

    @PostProxy
    @Override
    public void sayQuote() {
        System.out.println("Я ЖИДКИЙ");
    }

}
