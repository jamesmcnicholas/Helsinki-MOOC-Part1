import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class WordsInReverseOrder {
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
            Collections.reverse(words);
            for (String word:words){
                System.out.println(word);
            }
        }
    }
