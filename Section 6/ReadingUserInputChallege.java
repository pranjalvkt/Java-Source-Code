import java.util.Scanner;

public class ReadingUserInputChallege
{
    public static void main(String[] args) 
    {
        int count = 0;
        int sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        // while(true)
        while(count < 10)
        {
            int order = count + 1;
            System.out.println("Enter number #" + order);

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt)
            {
                int number = scanner.nextInt();
                count++;
                sum += number;
                // if(count == 10)
                // {
                //     break;
                // }

            }
            else
            {
                System.out.println("Invalid input");
            }
            scanner.nextLine();
            
        }
        System.out.println("sum = " + sum);
        scanner.close();


    }
}