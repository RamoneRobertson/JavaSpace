package exceptions;

import java.io.IOException;

public class Account {
    public void deposit(double value) throws IOException{
        if(value <= 0){
            throw new IOException();
        }
    }
}
