
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        boolean found = false;
        String inp = "";
        while (!found){
            System.out.println("Type the password: ");
            inp = reader.nextLine();
            if (inp.equals(password)){
                System.out.println("Right!");
                found = true;
            }else{
                System.out.println("Wrong!");
            }
            System.out.println("The secret is: jryy qbar!");
        }
        // Write your code here
    }
}
