
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        String inp;
        ArrayList<String> words = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.println("Type a word: ");
            inp = reader.nextLine();
            if (words.contains(inp)){
                System.out.println("You gave twice the word "+inp);
                break;
            }
            words.add(inp);
        }

        
    }
}
