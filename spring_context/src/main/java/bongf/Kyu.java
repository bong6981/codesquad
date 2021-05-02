package bongf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Kyu {

    private static final Logger logger = LoggerFactory.getLogger(Kyu.class);
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/config.xml", Kyu.class);
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car.run());
    }
}
