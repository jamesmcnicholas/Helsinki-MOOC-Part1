
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added){
        Money sum = new Money(added.euros+this.euros,added.cents+this.cents);
        return sum;
    }
    public boolean less(Money compared){
        if(this.euros<compared.euros){
            return true;
        }else if(this.euros==compared.euros&&this.cents<compared.cents){
            return true;
        }
        return false;
    }
    public Money minus(Money decremented){
        int newCent = this.cents-decremented.cents;
        int newEuro = this.euros-decremented.euros;
        int temp;
        if (newCent<0){
            temp = 100+newCent;
            newCent=temp;
            newEuro--;
        }
        if (newEuro<0){
            Money sub = new Money (0,0);
            return sub;
        }else {
            Money sub = new Money(newEuro, newCent);
            return sub;
        }

    }
}
