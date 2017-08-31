
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String studentNumber;
        ArrayList<Student> students = new ArrayList<>();
        while(true){
            System.out.println("name: ");
            name = input.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("studentnumber: ");
            studentNumber = input.nextLine();
            students.add(new Student(name,studentNumber));
        }
        for(Student student:students){
            System.out.println(student);
        }
        System.out.println("Give search term: ");
        String term = input.nextLine();
        System.out.println("Result: ");
        for (Student student:students){
            if (student.getName().contains(term)){
                System.out.println(student);
            }
        }
    }
}