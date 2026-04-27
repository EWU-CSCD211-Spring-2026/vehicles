package model;
import datastore.*;
/**
 * Represents a Vehicle
 */
public abstract class Vehicle implements CsvStorable {

    private String color;
    private final int price;


    /**
     * Initialize a vehicle
     * @param color the color of the vehicle
     */
    public Vehicle(String color, int price) {
        this.color = color;
        this.price = price;
        System.out.println("Initializing vehicle");
    }

    public int getPrice() {
        return price;
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
        return "color: " + color +
            "; price = " + price;
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

        if (this.price != other.price) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int res = color.hashCode();

        res = 31 * res + price;

        return res;
    }



}
