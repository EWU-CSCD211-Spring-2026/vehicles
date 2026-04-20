
package model;

/**
 * Represents a Car
 */
public class Car extends Vehicle implements IPassengerCarrier, Driveable {

    private int speed;
    private final String brand; // Subaru, Toyota, etc.?
    private final DriveTrain driveTrain;
    private Person[] passengers;
    private int totalPassengers;
    private final int passengerCapacity;

    /**
     * Initialize a car with a color and a brand
     * @param color the color of the car
     * @param brand the brand of the car
     * @param driveTrain the drive train of the car
     */
    public Car(String color, 
        String brand, 
        DriveTrain driveTrain,
        int passengerCapacity
    ) {
        super(color);
        this.speed = 0;
        this.brand = brand;
        this.driveTrain = driveTrain;
        this.passengerCapacity = passengerCapacity;
        this.passengers = new Person[passengerCapacity];
        this.totalPassengers = 0;
        System.out.println("Initializing " + color + " " + brand + " car with " + this.passengerCapacity + " passenger capacity.");
    }

    /**
     * return a String representation of the car
     */
    @Override
    public String toString() {
        return "Car, speed=" + this.speed + ", color = " + getColor();
    }


    /**
     * Car-specific acceleration checklist
     */
    @Override
    public void accelerate() {
        System.out.println("Car accelerating.");
        System.out.println("Check gas");
        System.out.println("Engage engine");
        this.speed = this.speed + 1;
        System.out.println("Current speed: " + this.speed);
    }

    @Override
    public void addPassenger(Person p) {
        if (this.totalPassengers == this.passengerCapacity) {
            System.out.println("Car is full!");
            return;
        }
        passengers[this.totalPassengers++] = p;
    }

    @Override
    public void removePassenger(Person p) {
        if (this.totalPassengers == 0) {
            System.out.println("Car is empty!");
            return;
        }
        this.totalPassengers--;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            System.out.println("obj is null");
            return false;
        }
        if (!super.equals(obj)) {
            System.out.println("super not equals");
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            System.out.println("wrong type");
            return false;
        }
        if (!(obj instanceof Car)) {
            System.out.println("wrong type");
            return false;
        }

        Car other = (Car) obj;

        if (!(this.brand.equals(other.brand))) {
            System.out.println("brand is different");
            return false;
        }
        if (!(this.driveTrain.equals(other.driveTrain))) {
            System.out.println("drive train is different");
            return false;
        }
        // if the length of the array and each element is equal
        //
        if (this.passengerCapacity != other.passengerCapacity) {
            return false;
        }

        //if (this.totalPassengers != other.totalPassengers) {
            //return false;
        //}

        //for (int i = 0; i < this.totalPassengers; i++) {
            //if (this.passengers[i] == null && other.passengers[i] == null) {
                //continue;
            //}

            //if (this.passengers[i] != null && !(this.passengers[i].equals(other.passengers[i])) {
                //return false;
            //}
        //}

        return true;
    }

    @Override 
    public int hashCode() {
        int res = brand.hashCode();
        res = 31 * res + driveTrain.hashCode();

        // let's omit passengers from hashCode
        //for (int i = 0; i < this.totalPassengers; i++) {
            //if (this.passengers[i] != null) {
                //res = 31 * res + this.passengers[i].hashCode();
            //}
        //}
        res = 31 * res + this.passengerCapacity;
        //res = 31 * res + this.totalPassengers;

        return res;

    }



    @Override
    public void driveTo(String dest) {
        System.out.println("driving to " + dest);
    }


    @Override
    public void toCsv() {
        String lines = "brand,passengerCapacity\n";
        lines += this.brand + "," + this.passengerCapacity + "\n";

        System.out.println(lines);
    }
}
