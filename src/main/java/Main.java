import calculator.Calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter number 1");
        double num1 = scanner.nextDouble();

        System.out.println("Enter number 2");
        double num2 = scanner.nextDouble();

        System.out.println("Enter operator (+, - , * , /)");
        String operator = scanner.next();

        switch (operator){
            case "+":
                System.out.println(calculator.add(num1, num2));
                break;
            case "-":
                System.out.println(calculator.subtract(num1, num2));
                break;
            case "*":
                System.out.println(calculator.multiply(num1, num2));
                break;
            case "/":
                System.out.println(calculator.divide(num1, num2));
                break;
        }

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