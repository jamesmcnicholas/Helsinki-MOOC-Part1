import java.util.ArrayList;

public class Variance {

    public static int sum(ArrayList<Integer> list) {
        int sum=0;
        for(int item:list){
            sum+=item;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double avg = (double)(sum(list));
        avg/=list.size();
        return avg;
    }
    public static double variance(ArrayList<Integer> list) {
        double avg = average(list);
        double total=0;
        for(int item:list){
            total+=((item-avg)*(item-avg));
        }
        total/=(list.size()-1);
        return total;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
