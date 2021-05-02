package bongf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    @Autowired
    @Qualifier("kTire")
    private Tire tire;

    public String run() {
        return tire.getBrand() + "로 쌩쌩!";
    }
}
