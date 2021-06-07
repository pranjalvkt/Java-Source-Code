public class MoreOnMethod
{
    public static void main(String[] args)
    {
        boolean i = shouldWakeUp(true, 8);
        System.out.println(i);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        int bark = hourOfDay;
        if(barking == true)
        {
            if((hourOfDay > 0) && (hourOfDay < 23))
            {
                if(bark > 8 && bark < 22)
                {
                    return true;
                }
            }
            else
                return false;
            
        }
        return false;
            
    }
}