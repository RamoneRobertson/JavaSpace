import generics.GenericList;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        new GenericList<>()
    }
}


//        ExceptionDemo.show();
//        Account account = new Account();
//        try {
//            account.deposit(100);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            account.withdraw(100);
//        } catch (AccountException e) {
//            var cause = e.getCause();
//            System.out.println(cause.getMessage());
//        }