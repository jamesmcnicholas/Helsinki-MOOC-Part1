import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int i=0;
        int num;
        this.numbers = new ArrayList<Integer>();
        while (i<7){
            num=random.nextInt(39)+1;
            if(!this.numbers.contains(num)){
                this.numbers.add(num);
                i++;
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)){
            return true;
        }
        return false;

    }
}
