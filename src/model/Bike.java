package model;

/**
 * Represents a Bike
 */
public class Bike extends Vehicle {

    private final String brakeType;
    private final String handlebarType;

    
    /**
     * Initialize bike with parameters
     * @param color the color of the bike
     */
    public Bike(String color) {
        super(color);
        this.brakeType = "pad";
        this.handlebarType = "straight";
    }

    /**
     * Accelerate the bike
     */
    @Override
    public void accelerate() {
        System.out.println("Turn bike pedal");
    }

    @Override
    public void toCsv() {
        StringBuilder sb = new StringBuilder();
        sb.append("brakeType,handlebarType\n");
        sb.append(this.brakeType + "," + this.handlebarType + "\n");
        String lines = sb.toString();

        System.out.println(lines);
    }

}
