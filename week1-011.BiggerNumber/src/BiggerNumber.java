
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int a = reader.nextInt();
        System.out.println("Type another number:");
        int b = reader.nextInt();
        int bigger = Math.max(a, b);
        System.out.println("The bigger of the two numbers given was: "+bigger);
        // Implement your program here. Remember to ask the input from user
    }
}
