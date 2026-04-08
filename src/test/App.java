package test;
import model.*;

public class App {

    public static void main(String[] args) {

        System.out.println("main method setup");

         Car subaru = new Car("red", "Subaru");
         subaru.accelerate();

         Car toyota = new Car("blue", "Toyota");
         toyota.accelerate();


    }

}
