
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        System.out.println("Until what?");
        int limit = Integer.parseInt(reader.nextLine());
        for (int i =1;i<=limit;i++){
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }
}
