public class WhileDoWhile
{
    public static void main(String[] args) 
    {
        // int count = 6;
        // while(count != 5)
        // {
        //     System.out.println("count value is " + count);
        //     count++;
        // }
        
        // do
        // {
        //    System.out.println("count value is " + count);
        //    count++;
           
        //    if(count > 100)
        //    {
        //        break;
        //    }
        // }
        // while(count != 6); //  IN DO-WHILE'S WHILE ";" IS REQUIRED

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while(number <= finishNumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }

            count++;
            System.out.println("Even Number " + number);
            if(count == 5)
            {
                System.out.println("count = " + count);
                break;
            }
            
        }
            
    }
    // challenge
    public static boolean isEvenNumber(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }
        return false;
    }

}