import generics.GenericList;

public class Main {

    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();

        list.add(34);
        list.add(45);
        list.add(65);

        for(int i= 0; i < list.length(); i++){
            System.out.println(list.get(i));
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