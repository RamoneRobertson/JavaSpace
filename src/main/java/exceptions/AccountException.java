package exceptions;

public class AccountException extends Exception {
    public AccountException(InsufficientFundsException e) {
        super(e);
    }
}
