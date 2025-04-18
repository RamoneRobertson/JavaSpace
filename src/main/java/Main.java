import exceptions.Account;
import exceptions.ExceptionDemo;
import exceptions.InsufficientFundsException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        ExceptionDemo.show();
        Account account = new Account();
        try {
            account.deposit(100);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            account.withdraw(100);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
