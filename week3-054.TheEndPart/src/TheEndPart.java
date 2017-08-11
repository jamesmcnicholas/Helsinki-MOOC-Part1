import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the end part: ");
        int part2 = Integer.parseInt(reader.nextLine());
        System.out.println("Result: "+word.substring((word.length()-part2),word.length()));
    }
}
