public class BarkingDog
{
    public static void main(String[] args) 
    {
        boolean i = shouldWakeUp(false, 8);
        System.out.println(i);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(barking == true)
        {
            if((hourOfDay > 0) && (hourOfDay < 23))
            {
                return true;
            }
            else
                return false;
            
        }
        return false;
            
    }

}