public class DecimalComparator
{
    public static void main(String[] args) 
    {
        System.out.println(areEqualByThreeDecimalPlaces(2.555, 2.2254));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {

        Double.compare(num1, num2);
        {
            return true;
        }


    }
}