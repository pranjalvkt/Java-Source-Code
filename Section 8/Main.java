public class Main
{
    public static void main(String[] args) 
    {

        Dimensions dimensions = new Dimensions(20, 20, 5);              // creating instance of class dimention
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Moniter theMoniter = new Moniter("27 inch Beast", "Acer", 27, new Resolution(2540, 1440)); // same as line 6

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMoniter, theMotherboard);

        thePC.powerUp();

    }
}