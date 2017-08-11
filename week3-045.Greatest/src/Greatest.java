
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int bigger;
        if (number1>number2){
            bigger=number1;
        }else{
            bigger=number2;
        }
        if (number3>bigger){
            bigger=number3;
        }
        return bigger;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}