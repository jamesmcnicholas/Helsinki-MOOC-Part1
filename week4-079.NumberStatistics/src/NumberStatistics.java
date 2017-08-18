import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics(){
        this.amountOfNumbers=0;
        this.sum=0;
    }

    public void addNumber(int number){
        amountOfNumbers++;
        sum+=number;
    }

    public int amountOfNumbers(){
        return amountOfNumbers;
    }

    public int sum(){
        return this.sum;
    }

    public double average(){
        double avg =0;
        if (amountOfNumbers>0){
        avg=this.sum;
        avg/=this.amountOfNumbers;
        }
        return avg;
    }
}
