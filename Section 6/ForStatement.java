public class ForStatement
{
    public static void main(String[] args) 
    {
        for(double interest = 2; interest < 9; interest++)
        {
            System.out.println("Interest rate at " + interest + "% = " + calculateInterest(10000, interest));
        }

        System.out.println("Backward ");

        for(double interest = 8; interest > 1; interest--)
        {
            System.out.println("Interest rate at " + interest + "% = " + calculateInterest(10000, interest));
        }
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate / 100));
    }
}