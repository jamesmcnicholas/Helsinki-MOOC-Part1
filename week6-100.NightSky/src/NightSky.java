import java.util.Random;

/**
 * Created by James on 02/09/2017.
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int stars=0;

    public NightSky(double density){
        this.density = density;
        this.width=20;
        this.height=10;
        this.stars=0;
    }
    public NightSky(int width, int height){
        this.width=width;
        this.height=height;
        this.density=0.1;
        this.stars=0;
    }
    public NightSky(double density, int width, int height){
        this.density=density;
        this.width=width;
        this.height=height;
        this.stars=0;
    }

    public void printLine(){
        double prob;
        Random random = new Random();
        String temp="";

        for(int i=0;i<this.width;i++){
            prob=random.nextDouble();
            if(prob>this.density){
                temp+=" ";
            }else{
                temp+="*";
                this.stars++;
            }
        }

        System.out.println(temp);
    }
    public void print(){
        this.stars=0;
        for (int i=0;i<this.height;i++){
            printLine();
        }
    }
    public int starsInLastPrint(){
        return this.stars;
    }
}
