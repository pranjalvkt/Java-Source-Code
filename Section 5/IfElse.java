public class IfElse
{
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) // if(gameOver == true)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your score was " + finalScore);
        }

        // Challenge
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("your Second score was " + finalScore);
        }
    }
}