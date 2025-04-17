package exceptions;

import java.io.FileReader;

public class ExceptionDemo {
    public static void show(){
        // Example of a checked exception
        // FileNotFound Exception (The Java compiler checks for you at compile time)
        var reader = new FileReader("file.txt");

        // Example of Unchecked exception
        // This will throw a NullPointer Exception
        // Unchecked exceptions happen at runtime due to programming errors/mistakes
        sayHello(null);
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name.toUpperCase());
    }
}
