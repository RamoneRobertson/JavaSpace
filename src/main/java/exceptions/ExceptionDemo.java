package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void show(){
        FileReader reader = null;
        // Example of a checked exception
        // FileNotFound Exception (The Java compiler checks for you at compile time)
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
            reader.close();
            new SimpleDateFormat().parse("");
            System.out.println("File opened");
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException | ParseException e){
            System.out.println(e.getMessage());
        } finally {
            if(reader != null){
                try{
                    reader.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }

            }

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
