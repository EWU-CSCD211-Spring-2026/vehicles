package test;

import model.*;

public class App2 {

    public static void main(String[] args) {

        Car  c1 = new Car("blue", "subaru", new DriveTrain("AWD"), 4);

        Car c2 = new Car("blue", "subaru", new DriveTrain("AWD"), 4);

        Person p = new Person("Alice");
        c1.addPassenger(p);

        c1.driveTo("Spokane");

        System.out.println("c1.equals(c2): " + c1.equals(c2));

    }

}
