public class PrimeNo
{
    public static void main(String[] args) 
    {
        for(int r =1; r<20; r++)
        {
            if(isPrime(r))
            {
                System.out.println("Number " + r + " is prime number");
            }
        }
    }

    public static boolean isPrime(int n)
    {
        if(n == 0)
        {
            return false;
        }
        for(int i = 2; i<= n/2; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}