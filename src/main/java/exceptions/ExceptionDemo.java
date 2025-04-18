package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void show(){
        // Example of a checked exception
        // FileNotFound Exception (The Java compiler checks for you at compile time)
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("file.txt");
        ){
            var value = reader.read();
        }  catch (IOException e){
            System.out.println("Could not read file");
        }

        // Example of Unchecked exception
        // This will throw a NullPointer Exception
        // Unchecked exceptions happen at runtime due to programming errors/mistakes
//        sayHello(null);
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name.toUpperCase());
    }
}
