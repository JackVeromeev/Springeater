package com.veromeev.springeater.screensaver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

/**
 * Created by jack on 8/24/17.
 *
 * @author Jack Veromeyev
 */

@Configuration
@ComponentScan(basePackages = "com.veromeev.springeater.screensaver")
public class ScreenSaverConfig {

    @Bean
    @Scope("prototype")
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ScreenSaverFrame screenSaverFrame() {
        return new ScreenSaverFrame() {
            @Override
            public Color getColor() {
                return color();
            }
        };
    }
}
