import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int limit = Integer.parseInt(reader.nextLine());
        int fact=1;
        for (int i =1;i<=limit;i++){
            fact*=i;
        }
        System.out.println("Factorial is "+fact);
    }
}
