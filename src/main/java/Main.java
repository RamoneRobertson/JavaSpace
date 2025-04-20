import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int userGuess = 0;

        while(userGuess != randomNumber){
            System.out.println("Please enter a number between 1 and 100");
            userGuess = scanner.nextInt();
            System.out.println("You guessed: " + userGuess);
            checkGuess(userGuess, randomNumber);
        }


    }

    public static void checkGuess(int userGuess, int randomNumber) {
        if(userGuess < randomNumber){
            System.out.println("Your guess is too low");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess is too high");
        } else if (userGuess == randomNumber) {
            System.out.println("Bingo!");
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