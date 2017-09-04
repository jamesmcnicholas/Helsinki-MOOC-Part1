import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Grade grade = new Grade(input);
        grade.getScores(input);
        grade.gradeDistribution();
        System.out.println("Acceptance percentage: "+grade.acceptancePercentage());
    }
}
