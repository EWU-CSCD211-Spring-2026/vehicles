package model;

/**
 * Represents a Bike
 */
public class Bike extends Vehicle {

    private String brakeType;
    
    /**
     * Initialize bike with parameters
     * @param color the color of the bike
     */
    public Bike(String color) {
        super(color);
        this.brakeType = "pad";
    }

    /**
     * Accelerate the bike
     */
    @Override
    public void accelerate() {
        System.out.println("Turn bike pedal");
    }

}
