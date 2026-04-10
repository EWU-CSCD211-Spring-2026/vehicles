package model;

/**
 * Represents a Vehicle
 */
public abstract class Vehicle {

    private String color;

    /**
     * Initialize a vehicle
     * @param color the color of the vehicle
     */
    public Vehicle(String color) {
        this.color = color;
        System.out.println("Initializing vehicle");
    }

    /**
     * get the color of the vehicle
     * @return the color the vehicle
     */
    public String getColor() {
        return this.color;
    }

    /**
     * accelerate the vehicle
     * Perform neceessary setup
     * Check systems
     */
    public abstract void accelerate();

}
