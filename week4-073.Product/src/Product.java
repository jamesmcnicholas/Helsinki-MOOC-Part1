/**
 * Created by James on 15/08/2017.
 */
public class Product {
    private double price;
    private String name;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name=nameAtStart;
        this.price=priceAtStart;
        this.amount=amountAtStart;
    }
    public void printProduct(){
        System.out.println(this.name+", price "+this.price+", amount "+this.amount);
    }
}
