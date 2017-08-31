public class Main {
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        Player Sam = new Player("Sam",39);
        barcelona.addPlayer(Sam);
        barcelona.printPlayers();
    }
}
