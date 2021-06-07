public class MethodChallege
{
    public static void main(String[] args) 
    {

        int highScorePosition = calculatedHighScorePosition(1500);
        displayHighScorePosition("Pranjal", highScorePosition);


        highScorePosition = calculatedHighScorePosition(900);
        displayHighScorePosition("Sandeep", highScorePosition);

        highScorePosition = calculatedHighScorePosition(400);
        displayHighScorePosition("Raj", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Ram", highScorePosition);

        highScorePosition = calculatedHighScorePosition(1000);
        displayHighScorePosition("RamK", highScorePosition);

        highScorePosition = calculatedHighScorePosition(500);
        displayHighScorePosition("Satyam", highScorePosition);

        highScorePosition = calculatedHighScorePosition(100);
        displayHighScorePosition("Saurabh", highScorePosition);

    }
    public static void displayHighScorePosition(String playerName,int position)
    {
        System.out.println(playerName + " Managed to get into the position " + position + " on the high score table");

    }
    public static int calculatedHighScorePosition(int playerScore)
    {
        // if (playerScore >= 1000)
        //     {
        //         return 1;
        //     }
        // else if(playerScore >= 500)
        //     {
        //         return 2;
        //     }
        // else if(playerScore >= 100)
        //     {
        //         return 3;
        //     }
        // return 4;

        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        }
        else if(playerScore >= 500){
            position = 2;
        }
        else if(playerScore >= 100){
            position =3;
        }
        return position;
    }
}