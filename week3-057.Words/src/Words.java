import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String inp;
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word: ");
        inp = reader.nextLine();
        words.add(inp);
        while (true){
            System.out.println("Type a word: ");
            inp = reader.nextLine();
            words.add(inp);
            if (inp.isEmpty()){
                break;
            }
        }
        System.out.println("You typed the following words: ");
        for (String entry:words){
            System.out.println(entry);
        }
    }
}
