package model;

public class Vehicle {

    private String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void accelerate() {
        System.out.println("Vroom");
    }

}
