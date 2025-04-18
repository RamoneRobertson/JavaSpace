package exceptions;

// Checked -> Exception
// Unchecked -> Runtime Exception

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        System.out.println("Insufficient Funds");
    }

    public InsufficientFundsException(String message){
        super(message);
    }

}
