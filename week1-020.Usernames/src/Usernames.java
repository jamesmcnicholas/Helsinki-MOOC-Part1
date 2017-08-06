
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String u1 = "alex";
        String u2 = "emily";
        String p1 = "mightyducks";
        String p2 = "cat";
        System.out.println("Type your username:");
        String inp1 = reader.nextLine();
        System.out.println("Type your password:");
        String inp2 = reader.nextLine();
        if (inp1.equals(u1)){
            if(inp2.equals(p1)){
                System.out.println("You are now logged into the system!");
            }else{
                System.out.println("Your username or password was invalid!");
            }
        }else if (inp1.equals(u2)){
            if(inp2.equals(p2)){
                System.out.println("You are now logged into the system!");
            }else{
                System.out.println("Your username or password was invalid!");
            }
        }else{
            System.out.println("Your username or password was invalid!");
        }

    }
}
