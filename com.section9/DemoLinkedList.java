import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DemoLinkedList
{
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Delhi");
        addInOrder(placesToVisit, "Mumbai");
        addInOrder(placesToVisit, "Lucknow");
        addInOrder(placesToVisit, "Banglore");
        addInOrder(placesToVisit, "Kolkata");
        addInOrder(placesToVisit, "Chennai");
        addInOrder(placesToVisit, "Ahemdabad");
        addInOrder(placesToVisit, "Chandigarh");
        addInOrder(placesToVisit, "Thiruvanantpuram");
        printList(placesToVisit);

        visit(placesToVisit);

        // placesToVisit.add("Sydney");
        // placesToVisit.add("Melbourne");
        // placesToVisit.add("Brisbane");
        // placesToVisit.add("Perth");
        // placesToVisit.add("Canberra");
        // placesToVisit.add("Adelaide");
        // placesToVisit.add("Darwin");

        // printList(placesToVisit);
        // placesToVisit.add(1, "Alice Springs");
        // printList(placesToVisit);
        // placesToVisit.remove(4);
        // printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList)
    {
        Iterator<String> i =linkedList.iterator();
        while(i.hasNext()) // CHECKING IF THERE IS A ENTRY
        {
            System.out.println("Now visiting " + i.next()); // IF THERE IS A ENTRY PRINT IT
        }
        System.out.println("FFFFFFFFFFFFFFFFFFFFFFFF");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext())
        {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0)
            {
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if(comparison > 0)
            {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison < 0)
            {

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList  cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty())
        {
            System.out.println("No cities in the itenerary ");
            return;
        }
        else
        {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                
                case 1:
                if(!goingForward)
                {
                    if(listIterator.hasNext())
                    {
                        listIterator.next();
                    }
                    goingForward = true;
                }
                if(listIterator.hasNext())
                    System.out.println("Now visiting " + listIterator.next());
                else 
                {
                    System.out.println("Reached the end of the list");
                    goingForward = false;
                }
                break;

                case 2:
                    if(goingForward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else 
                    {
                        System.out.println("We are at the start of list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;


            }
            
        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit\n" + 
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }

}