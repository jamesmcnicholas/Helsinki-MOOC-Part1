import java.util.ArrayList;

/**
 * Created by James on 03/09/2017.
 */
public class BirdStore {
    private ArrayList<Bird> birdList = new ArrayList<>();

    public BirdStore(){}

    public void addBird(String name,String latName){
        birdList.add(new Bird(name,latName));
    }
    public void stats(){
        for (Bird bird:this.birdList){
            System.out.println(bird);
        }
    }
    public boolean contains(String query){
        for(Bird b:this.birdList) {
            if (b.getName().contains(query)) {
                return true;
            }
        }
        return false;
    }
    public void observe(String name){
        for (Bird b:birdList){
            if (b.getName().contains(name)){
                b.observed();
            }
        }
    }
    public Bird printBird(String name){
        for(Bird b:birdList){
            if (b.getName().equals(name)){
                return b;
            }

        }
        return birdList.get(birdList.indexOf(name));
    }
}
