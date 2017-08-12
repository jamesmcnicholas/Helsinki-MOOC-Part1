
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String inp;
        while (true) {
            System.out.println("Type a word: ");
            inp = reader.nextLine();

            if (inp.isEmpty()) {
                break;
            } else {
                words.add(inp);
            }
        }
        Collections.sort(words);
        System.out.println("You typed the following words: ");
        for (String word:words){
            System.out.println(word);
        }
    }
}
