
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account myAcc = new Account("James' account",100.00);
        myAcc.deposit(20.0);
        System.out.println(myAcc);
    }

}
