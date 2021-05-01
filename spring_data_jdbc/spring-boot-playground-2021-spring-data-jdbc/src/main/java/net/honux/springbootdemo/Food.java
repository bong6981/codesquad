package net.honux.springbootdemo;

public class Food {
    public String name;
    public int cal;

    public Food(String name, int cal) {
        this.name = name;
        this.cal = cal;
    }

    public String getName() {
        return name;
    }

    public int getCal() {
        return cal;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", cal=" + cal +
                '}';
    }
}
