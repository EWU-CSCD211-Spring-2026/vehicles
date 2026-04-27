package model;
import java.util.Objects;

/**
 * Represents a Bike
 */
public class Bike extends Vehicle implements Comparable<Bike> {

    private final String brakeType;
    private final String handlebarType;

    
    /**
     * Initialize bike with parameters
     * @param color the color of the bike
     */
    public Bike(String color, String brakeType, String handlebarType, int price) {
        super(color, price);
        this.brakeType = brakeType;
        this.handlebarType = handlebarType;
    }

    /**
     * Accelerate the bike
     */
    @Override
    public void accelerate() {
        System.out.println("Turn bike pedal");
    }

    @Override
    public int hashCode() {
        int res = super.hashCode();
        res = 31 * res + Objects.hash(brakeType, handlebarType);
        return res;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(super.equals(obj))) {
            return false;
        }
        Bike other = (Bike) obj;

        if (!(this.brakeType.equals(other.brakeType))) {
            return false;
        }
        if (!(this.handlebarType.equals(other.handlebarType))) {
            return false;
        }

        return true;
    }

    @Override
    public void toCsv() {
        StringBuilder sb = new StringBuilder();
        sb.append("brakeType,handlebarType\n");
        sb.append(this.brakeType + "," + this.handlebarType + "\n");
        String lines = sb.toString();

        System.out.println(lines);
    }

    @Override
    public String toString() {

        String s = "color = " + getColor() + 
            "; brakeType = " + this.brakeType +
            "; handlebarType = " + this.handlebarType;

        return s;
    }

    @Override
    public int compareTo(Bike other) {

        if (this.getPrice() < other.getPrice()) {
            return 1;
        } else if (getPrice() > other.getPrice()) {
            return -1;
        } else {
            return 0;
        }

    }



}
