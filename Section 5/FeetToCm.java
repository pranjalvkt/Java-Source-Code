public class FeetToCm
{
    public static void main(String[] args) 
    {
        calcFeetAndInchesToCentimeter(5, 11);
        calcFeetAndInchesToCentimeter(157);
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) 
    {
        if(feet < 0 || (inches < 0) || (inches > 12))
        {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println("feet : " + feet + ", inches : " + inches + " = centimeter : " + centimeter);
        return centimeter;

    }
    public static double calcFeetAndInchesToCentimeter(double inches) 
    {
        if(inches < 0)
        {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeter(feet, remainingInches);
    }
}