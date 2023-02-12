public class Main {
    public static void main(String[] args) {
        Player player = new Player("Sachin", 40, "Cricket");
        System.out.println("Player's Name: " + player.getName());
        System.out.println("Player's Age: " + player.getAge());
        System.out.println("Player's Gametype: " + player.getGameType());
    }
}