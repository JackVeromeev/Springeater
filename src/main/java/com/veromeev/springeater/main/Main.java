package com.veromeev.springeater.main;

import com.veromeev.springeater.quoter.Quoter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jack on 8/15/17.
 *
 * @author Jack Veromeyev
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Quoter quoter = context.getBean(Quoter.class);

        while (true) {
            quoter.sayQuote();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
