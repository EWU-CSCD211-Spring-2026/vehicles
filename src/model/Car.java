
package model;

/**
 * Represents a Car
 */
public class Car extends Vehicle implements IPassengerCarrier {

    private int speed;
    private String brand; // Subaru, Toyota, etc.?
    private DriveTrain driveTrain;
    private Person[] passengers;
    private int passengerCapacity;

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
        this.passengers = new Person[passengerCapacity];
        System.out.println("Initializing " + color + " " + brand + " car.");
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
        passengers[index] = p;
    }

    @Override
    public void removePassenger(Person p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePassenger'");
    }
}
