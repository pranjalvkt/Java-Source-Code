public class A
{
    public static void main(String[] args) 
    {
        // INTEGER 
        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("INTEGER MIN VALUE IS : " + myMinValue);
        System.out.println("INTEGER MAX VALUE IS : " + myMaxValue);
        System.out.println("BUSTED MAX VALUE IS : " + (myMaxValue + 1));
        System.out.println("BUSTED MIN VALUE IS : " + (myMinValue - 1));
        int myMaxIntTest = 2147483647;

        // BYTE
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("BYTE MIN VALUE IS :" + myMinByteValue);
        System.out.println("BYTE MAX VALUE IS :" + myMaxByteValue);

        // SHORT
        Short myMaxShortValue = Short.MAX_VALUE;
        Short myMinShortValue = Short.MIN_VALUE;
        System.out.println("SHORT MIN VALUE IS : " + myMinShortValue);
        System.out.println("SHORT MAX VALUE IS : " + myMaxShortValue);

        // LONG
        long myLongValue = 100L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("LONG MIN VALUE IS : " + myMinLongValue);
        System.out.println("LONG MAX VALUE IS : " + myMaxLongValue);

        // TYPE CASTING
        int myTotal = (myMinValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);

        // System.out.println("INT myTotal : " + myTotal, "BYTE myNewByteValue : " + myNewByteValue, "SHORT myNewShortValue : " + myNewShortValue);




    }
}