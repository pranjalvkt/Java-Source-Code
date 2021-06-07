import java.util.ArrayList;

public class MainLinkedList
{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList("Pranjal", 54.96);
        LinkedList anotherLinkedList;
        anotherLinkedList = linkedList;
        anotherLinkedList.setBalance(12.18);
        System.out.println("Balance for customer " + linkedList.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i< intList.size(); i++)
        {
            System.out.println(i + ": " + intList.get(i));

        }

        intList.add(1, 2);

        for(int i = 0; i< intList.size(); i++)
        {
            System.out.println(i + ": " + intList.get(i));

        }
    }
}