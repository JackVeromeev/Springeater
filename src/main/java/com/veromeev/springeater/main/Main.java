package com.veromeev.springeater.main;

import com.veromeev.springeater.quoter.Quoter;
import com.veromeev.springeater.screensaver.ScreenSaverConfig;
import com.veromeev.springeater.screensaver.ScreenSaverFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jack on 8/15/17.
 *
 * @author Jack Veromeyev
 */
public class Main {

    public static void main(String[] args) throws Exception{
        terminatorXML();
    }

    public static void terminatorXML() throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("terminator_context.xml");
        Quoter quoter = context.getBean(Quoter.class);
//        while (true) {
//            quoter.sayQuote();
//            Thread.sleep(1000);
//        }
    }

    public static void screenSaver() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConfig.class);
        while (true) {
            context.getBean(ScreenSaverFrame.class).repaintRandom();
            Thread.sleep(100);
        }
    }



}
