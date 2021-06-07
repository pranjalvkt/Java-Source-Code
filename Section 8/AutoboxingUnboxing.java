import java.util.ArrayList;

public class AutoboxingUnboxing
{
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for(int i = 0; i<=10; i++)
        {
            intArray.add(Integer.valueOf(i)); // AUTOBOXING
        }

        for(int i = 0; i<=10; i++)
        {
            System.out.println(i + " ----> " + intArray.get(i).intValue());
        }
    }
}