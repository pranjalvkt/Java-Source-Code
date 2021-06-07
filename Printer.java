public class Printer
{
    public static void main(String[] args) {
        
    }

    public void printEqual(int a, int b, int c)
    {
        if(a < 0 || b < 0 || c < 0)
        {
            System.out.println("Invalid Value");

        }
        else if(a == b && b == c)
        {
            System.out.println("All numbers are equal");
        }
    }
}