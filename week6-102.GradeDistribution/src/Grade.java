import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by James on 02/09/2017.
 */
public class Grade {
    private ArrayList<Integer> scoreList = new ArrayList<>();
    private int totalScores;
    private int acceptedScores;

    public Grade(Scanner input){

    }
    public void getScores(Scanner input){
        int temp;
        this.totalScores=0;
        System.out.println("Type exam scores, -1 completes:");
        while(true) {
            temp = Integer.parseInt(input.nextLine());
            if (temp == -1) {
                break;
            } else if (temp >= 0 && temp <= 60) {
                this.scoreList.add(temp);
                this.totalScores++;
            }
        }
    }
    public void gradeDistribution(){
        int[] gradeCount = new int[6];
        this.acceptedScores=0;

        for(int grade:this.scoreList){
                if (grade<30){
                    gradeCount[0]++;
                }else if(grade<35){
                    gradeCount[1]++;
                    this.acceptedScores++;
                }else if(grade<40){
                    gradeCount[2]++;
                    this.acceptedScores++;
                }else if(grade<45){
                    gradeCount[3]++;
                    this.acceptedScores++;
                }else if(grade<50){
                    gradeCount[4]++;
                    this.acceptedScores++;
                }else{
                    gradeCount[5]++;
                    this.acceptedScores++;
                }
        }

        System.out.println("Grade distribution:");
        for (int i=0;i<6;i++) {
            System.out.print(i+": ");
                for (int j=0;j<gradeCount[i];j++){
                    System.out.print("*");
            }
            System.out.print("\n");
        }

    }
    public double acceptancePercentage() {
        double pct;

        if (this.totalScores > 0) {
            pct =(this.acceptedScores);
            pct/=this.totalScores;
            pct*=100;
        }else{
            pct = 0;
        }
        return pct;
    }
}