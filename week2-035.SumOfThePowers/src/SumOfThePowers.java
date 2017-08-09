
import java.util.Scanner;

public class SumOfThePowers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number");
        int total=0;
        int limit = Integer.parseInt(reader.nextLine());
        for (int i=0;i<=limit;i++){
            total+=Math.pow(2,i);
        }
        System.out.println("THe result is "+total);
    }
}
