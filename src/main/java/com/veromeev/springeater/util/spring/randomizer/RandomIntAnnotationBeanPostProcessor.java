package com.veromeev.springeater.util.spring.randomizer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;

public class RandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {
    private Random random;

    public RandomIntAnnotationBeanPostProcessor() {
        random = new Random();
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            RandomInt annotation = field.getAnnotation(RandomInt.class);
            if (annotation != null) {
                field.setAccessible(true);
                int max = annotation.max();
                int min = annotation.min();
                int result = random.nextInt(max - min) + min;
                ReflectionUtils.setField(field, bean, result);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
