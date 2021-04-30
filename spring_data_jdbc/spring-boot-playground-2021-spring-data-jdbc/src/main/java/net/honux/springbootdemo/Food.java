package net.honux.springbootdemo;

public class Food {
    public String name;
    public int cal;

    public Food(String name, int cal) {
        this.name = name;
        this.cal = cal;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", cal=" + cal +
                '}';
    }
}
