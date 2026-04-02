
package model;

public class Car {

    private String color;
    private int speed;
    private String brand; // Subaru, Toyota, etc.?

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car, speed=" + this.speed + ", color = " + this.color;
    }
}
