
public class Bird {
    private String name;
    private String latName;
    private int Observed;

    public Bird(String name, String latName){
        this.name=name;
        this.latName=latName;
    }

    public String getName(){
        return this.name;
    }
    public void observed(){
        this.Observed++;
    }
    public String toString(){
        return this.name+" ("+this.latName+") "+this.Observed+" observations";
    }
}
