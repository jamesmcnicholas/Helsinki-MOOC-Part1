
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String n1 = reader.nextLine();
        System.out.println("Type your age:\n");
        int a1 = Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.println("Type your name:");
        String n2 = reader.nextLine();
        System.out.println("Type your age:\n");
        int a2 = Integer.parseInt(reader.nextLine());
        int sum = (a1+a2);
        System.out.println(n1+" and "+n2+" are "+sum+" years old in total.");
        // Implement your program here
    }
}
