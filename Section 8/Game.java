public class Game
{
    public static void main(String[] args) {
        // Player player = new Player();
        // player.name = "tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // player.loseHealth(10);
        // System.out.println("Remaining health " + player.healthRemaining());
        // player.health = 200;
        // player.loseHealth(11);
        // System.out.println("Remaining health " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("tim", 250, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}