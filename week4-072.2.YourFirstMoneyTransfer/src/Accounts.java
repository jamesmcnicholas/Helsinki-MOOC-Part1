
public class Accounts {

    public static void main(String[] args) {
        Account Matts = new Account("Matt's account",1000);
        Account myAccount = new Account("My account", 0);
        Matts.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(Matts);
        System.out.println(myAccount);
    }

}
