
package test;
import model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class AppCollections {


    public static void main(String[] args) {

        Car  c1 = new Car("blue", "subaru", new DriveTrain("AWD"), 4, 120, 50000);
        Car  c2 = new Car("blue", "subaru", new DriveTrain("AWD"), 4, 120, 30000);

        int order = c1.compareTo(c2);
        System.out.println("order: " + order);


        List<Car> listOfCars = new ArrayList<Car>();
        listOfCars.add(c1);
        
        listOfCars.add(new Car("black", "toyota", new DriveTrain("FWD"), 2, 120, 30000));
        listOfCars.add(c2);

        System.out.println(listOfCars);

        Collections.sort(listOfCars);

        System.out.println();

        System.out.println(listOfCars);

        System.out.println();


        Bike b1 = new Bike("red", "pad", "straight", 200);
        Bike b2 = new Bike("blue", "disc", "curved", 300);
        Bike b3 = new Bike("blue", "disc", "straight", 150);

        List<Bike> listOfBikes = new ArrayList<>();
        listOfBikes.addFirst(b1);
        listOfBikes.addFirst(b2);
        listOfBikes.addFirst(b3);

        System.out.println(listOfBikes);
        System.out.println();

        Collections.sort(listOfBikes);

        System.out.println(listOfBikes);






    }


}
