
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        double inp;
        while (true) {
            System.out.println("Enter a temperature");
            inp=Double.parseDouble(reader.nextLine());
            if((inp>=-30)&&(inp<=40)){
                Graph.addNumber(inp);
            }

        }
    }
}