public class Float
{
    public static void main(String[] args) 
    {

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("DOUBLE MINIMUM VALUE : " + myMinDoubleValue);
        System.out.println("DOUBLE MAXIMUM VALUE :" + myMaxDoubleValue);

        int i = 5 / 2;
        float f = 5f / 3f;                                          // float f = 5.0 / 3.0;
        double d = 5d / 3d;
        System.out.println("i : " + i);
        System.out.println("f : " + f);
        System.out.println("d : "+ d);


    }
}