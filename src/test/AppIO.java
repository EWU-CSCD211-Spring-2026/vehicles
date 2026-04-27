
package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppIO  {

    public static void main(String[] args) {

        String filePath = "example.csv";
        String data = "Name,Age,Major\n";
        data += "Alice,20,Computer Science\n";
        data += "Bob,22,Mathematics\n";

        //try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            //writer.write(data);

            //System.out.println("Data written to file successfully.");

        //} catch (IOException e) {

            //System.err.println("An error occurred while writing to the file: " + e.getMessage()
        //}

    }
}
