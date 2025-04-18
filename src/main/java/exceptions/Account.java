package exceptions;

import java.io.IOException;

public class Account {
    private double balance;

    public void deposit(double value) throws IOException{
        if(value <= 0){
            throw new IOException();
        }
    }

    public void withdraw(double value) throws InsufficientFundsException {
        if(value > balance){
            throw new InsufficientFundsException("Looks like the funds aint funding my boi. Trying to withdraw more than you got.");
        }
    }
}
