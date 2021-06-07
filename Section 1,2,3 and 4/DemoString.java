public class DemoString
{
    public static void main(String[] args) 
    {

        String myString = "this is a string";
        System.out.println(myString);

        myString = myString + " and this is more.";
        System.out.println(myString);

        myString = myString + "\u00A9 2019";
        System.out.println(myString);

        // ADDING STRING AND STRING
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        // ADDING STRING AND INT
        String lastString = "10";
        int myInt = 50;
        lastString =lastString +myInt;
        System.out.println(lastString);

        // ADDING STRING AND DOUBLE
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}