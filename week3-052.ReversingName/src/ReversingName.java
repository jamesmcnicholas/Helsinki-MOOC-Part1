import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name");
        String name = reader.nextLine();
        int j=name.length()-1;
        System.out.println("In reverse order: ");
        while (j>=0){
            System.out.print(name.charAt(j));
            j--;
        }
    }
}
