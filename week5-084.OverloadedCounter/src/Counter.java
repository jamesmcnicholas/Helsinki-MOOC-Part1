/**
 * Created by James on 19/08/2017.
 */
public class Counter {
    private int value;
    private boolean check;

    public Counter(int value, boolean check){
        this.value=value;
        this.check=check;
    }
    public Counter(int value){
        this(value,false);
    }
    public Counter(boolean check){
        this(0,check);
    }
    public Counter(){
        this(0,false);
    }

    public int value(){
        return this.value;
    }
    public void increase(){
        increase(1);
    }
    public void decrease(){
        decrease(1);
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (check) {
                if (this.value - decreaseAmount >= 0) {
                    this.value -= decreaseAmount;
                }else{
                    this.value=0;
                }
            } else {
                this.value -= decreaseAmount;
            }

        }
    }
    public void increase(int increaseAmount){
        if(increaseAmount>=0){
            this.value+=increaseAmount;
        }
    }
}
