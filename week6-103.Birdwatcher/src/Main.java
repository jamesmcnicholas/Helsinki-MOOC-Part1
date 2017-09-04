import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp;
        String name;
        String latName;
        String query;
        BirdStore birdStore = new BirdStore();

        while(true){
            System.out.println("?");
            temp=input.nextLine();

            if (temp.equals("Add")){
                System.out.println("Name: ");
                name = input.nextLine();
                System.out.println("Latin Name: ");
                latName=input.nextLine();
                birdStore.addBird(name,latName);

            }else if(temp.equals("Observation")){
                System.out.println("What was observed: ?");
                query = input.nextLine();
                if(birdStore.contains(query)){
                    birdStore.observe(query);
                }else{
                    System.out.println("Is not a bird!");
                }
            }else if(temp.equals("Statistics")){
                birdStore.stats();

            }else if(temp.equals("Show")){
                System.out.println("What?");
                query = input.nextLine();
                if(birdStore.contains(query)){
                    System.out.println(birdStore.printBird(query));
                }
            }else if(temp.equals("Quit")){
                break;
            }
        }
    }

}
