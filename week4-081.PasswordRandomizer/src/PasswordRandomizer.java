import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random = new Random();
    public PasswordRandomizer(int length) {
        this.length=length;
    }

    public String createPassword() {
        int i = 0;
        String pass="";
        String alpha="abcdefghijklmonpqrstuvwxyz";
        while(i<length){
            pass+=alpha.charAt(random.nextInt(26));
            i++;
        }
        return pass;
    }
}
