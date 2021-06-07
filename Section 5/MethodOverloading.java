public class MethodOverloading {
    public static void main(String[] args) 
    {
        int newScore = calculateScore("pranjal", 500);
        System.out.println("new score is " + newScore);

        calculateScore(75);

        calculateScore();
        
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + " score " + score);
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player score " + score);
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed player, no score ");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) 
    {
        if(feet < 0 || (inches < 0) || (inches > 12))
        {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println("feet " + feet + " inches " + inches + "centimeter " + centimeter);
        return centimeter;

    }
// public static int calcFeetAndInchesToCentimeter(double inches) {
//     if(inches >=0)
//     {
//         cm = inches * 2.54;
//     }
//     return -1;
// }
    
}