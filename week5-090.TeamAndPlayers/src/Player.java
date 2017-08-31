/**
 * Created by James on 23/08/2017.
 */
public class Player {
    private int goals;
    private String name;

    public Player(String name){
        this.name=name;
    }

    public Player(String name,int goals){
        this.name=name;
        this.goals=goals;
    }
    public String getName(){
        return this.name;
    }
    public int goals(){
        return this.goals;
    }
    public String toString(){
        return this.name+", goals "+this.goals;
    }
}
