
package test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppIO2 {

    public static void main(String[] args) throws IOException {

        File f = new File("file.csv");

        FileWriter fw = new FileWriter(f);

        if (f.exists()) {
            fw.write('a');
        }

        fw.flush();
        fw.close();

    }
}


