package test;

import model.*;

public class App2 {

    public static void main(String[] args) {

        Car  c1 = new Car("blue", "subaru", new DriveTrain("AWD"), 4, 120, 30000);

        Car c2 = new Car("blue", "subaru", new DriveTrain("AWD"), 4, 140, 50000);

        Person p = new Person("Alice");
        c1.addPassenger(p);
        c2.accelerate();

        c1.driveTo("Spokane");

        System.out.println("c1.equals(c2): " + c1.equals(c2));


        Bike b1 = new Bike("blue", "pad", "curved", 100);
        Bike b2 = new Bike("blue", "pad", "curved", 120);
        System.out.println("b1.equals(b2): " + b1.equals(b2));

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = c1;
        vehicles[1] = b1;

        for (int i = 0 ; i< vehicles.length; i++ ) {
            vehicles[i].toCsv();
        }

    }

}
