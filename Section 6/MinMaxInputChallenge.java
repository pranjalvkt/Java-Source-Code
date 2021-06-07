import java.util.Scanner;

public class MinMaxInputChallenge
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int min = 2147483647;
        int max = -2147483648;
        // boolean first = true;
        int count = 0;

        while(count < 5)
        {
            System.out.println("Enter number");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt)
            {
                int number = scanner.nextInt();

                // if(first)
                // {
                //     first = false;
                //     min = number;
                //     max = number;
                // }

                if(number > max)
                {
                    max = number;
                }

                if(number < min)
                {
                    min = number;
                }

            }
            else
            {
                System.out.println("Invalid number");
                break;
                
            }
            System.out.println("min = " + min + ", max = " + max);
            scanner.nextLine();
            count++;

        }
        scanner.close();
        
    }
}