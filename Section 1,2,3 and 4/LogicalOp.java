public class LogicalOp
{
    public static void main(String[] args) 
    {
        int topScore = 80;
        if (topScore < 100)
        {
            System.out.println("You got the high score");

        }

        // AND OPERATOR
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
        {
            System.out.println("Greater than second top score and less than 100");
        }

        // OR OPERATOR
        if ((topScore > 90) || (topScore <= 90))
        {
            System.out.println("Either or both of the condition are true.");

        }

        int newValue = 50;
        if (newValue == 50)
        {
            System.out.println("this is true");
        }

        boolean isChar = false;
        if (isChar) //NOT isChar --> false
        {
            System.out.println("this is not supposed to happen");
        }

        isChar = true;
        boolean wasChar = isChar ? true : false;
        if (wasChar)
        {
            System.out.println("wasChar is true");
        }


        double newFirstDouble = 20.00;
        double newSecondDouble = 80.00;
        double result = (newFirstDouble + newSecondDouble) * 100.00;
        System.out.println(result);
        double remainder = result % 40.00;
        System.out.println("Remainder : " + remainder);

        boolean noRemainder = (remainder == 0) ? true : false;
        System.out.println(noRemainder);
        if (!noRemainder)
        {
            System.out.println("Got some Remainder");
        }
        

    }   
}