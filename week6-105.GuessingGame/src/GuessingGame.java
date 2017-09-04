import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, otherwise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        int upper=upperLimit;
        int lower=lowerLimit;
        instructions(lowerLimit, upperLimit);
        while(true) {
            if (isGreaterThan(average(upper, lower))) {
                lower = average(upper, lower) + 1;
            } else {
                upper = average(upper, lower);
            }
            if(upper==lower){
                break;
            }
        }
        System.out.println("the number you're thinking of is "+lower);
    }

    public boolean isGreaterThan(int num){
        System.out.println("Is your number greater than "+num+"? (y/n)");
        if(reader.nextLine().equals("y")){
            return true;
        }
        return false;
    }

    public int average(int num1, int num2){
        return (num1+num2)/2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

}
