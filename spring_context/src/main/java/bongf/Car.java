package bongf;

public class Car {
    private Tire tire;

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String run() {
        return tire.getBrand() + "로 쌩쌩!";
    }
}
