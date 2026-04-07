
package model;

public class Car extends Vehicle {

    private int speed;
    private String brand; // Subaru, Toyota, etc.?

    public Car(int speed, String color, String brand) {
        super(color);
        this.speed = speed;
        this.brand = brand;
    }
    public Car() {
        this(1, "red", "Subaru");
        // this.speed = 1;
        // this.color = "red";
    }
    public Car(int speed) {
        this(speed, "red", "Subaru");
    }
    public Car(String color) {
        this(2, color, "Subaru");
    }

    @Override
    public String toString() {
        return "Car, speed=" + this.speed + ", color = " + this.color;
    }
    @Override
    public void accelerate() {
        System.out.println("Check gas");
        System.out.println("Engage engine");
    }
}
