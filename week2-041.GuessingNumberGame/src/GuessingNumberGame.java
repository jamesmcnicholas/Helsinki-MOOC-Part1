
import java.util.Random;
import java.util.Scanner;
public class GuessingNumberGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guesses=0;
        int guess=0;
        while (true) {
            System.out.println("Type a number");
            guess = Integer.parseInt(reader.nextLine());
            guesses++;
            if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: "+guesses);
            } else if (guess == numberDrawn) {
                System.out.println("Congratulations! Your guess is correct!");
                break;
            }else{
                System.out.println("The number is greater, guesses made: "+guesses);
            }
        }
    }
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
