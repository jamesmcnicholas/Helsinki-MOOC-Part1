import java.util.ArrayList;

/**
 * Created by James on 23/08/2017.
 */
public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> playerList = new ArrayList<>();

    public Team(String name){
        this.maxSize=16;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        if (!(this.playerList.size()>maxSize)) {
            this.playerList.add(player);
        }
    }
    public void printPlayers(){
        for (Player player:playerList){
            System.out.println(player);
        }
    }
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize-1;
    }
    public int size(){
        return this.playerList.size();
    }
    public int goals(){
        int totalGoals=0;
        for (Player player:playerList){
            totalGoals+=player.goals();
        }
        return totalGoals;
    }
}
