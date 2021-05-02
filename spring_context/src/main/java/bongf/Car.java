package bongf;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    @Autowired
    private Tire tire;

    public String run() {
        return tire.getBrand() + "로 쌩쌩!";
    }
}
