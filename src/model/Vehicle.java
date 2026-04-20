package model;
import datastore.*;
/**
 * Represents a Vehicle
 */
public abstract class Vehicle implements CsvStorable {

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

    @Override
    public String toString() {
        return "color: " + color;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Vehicle other = (Vehicle) obj;

        if (!(this.color.equals(other.color))) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int res = color.hashCode();

        return res;
    }



}
