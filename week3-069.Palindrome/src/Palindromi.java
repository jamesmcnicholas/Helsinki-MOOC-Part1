import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        ArrayList<String> store = new ArrayList<>();
        ArrayList<String> reverse = new ArrayList<>();
        for(int i=0;i<text.length();i++){
            store.add(text.substring(i,i+1));
            reverse.add(text.substring(i,i+1));
        }
        Collections.reverse(reverse);
        if (reverse.equals(store)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
