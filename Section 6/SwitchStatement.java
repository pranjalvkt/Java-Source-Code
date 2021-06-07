public class SwitchStatement
{
    public static void main(String[] args) 
    {
        // int value = 1;
        // if(value == 1)
        // {
        //     System.out.println("value is 1");
        // }
        // else if(value == 2)
        // {
        //     System.out.println("value was 2");
        // }
        // else
        // {
        //     System.out.println("was not 1 or 2");
        // }

        int switchValue = 3;
        switch(switchValue)
        {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("was not 1,2,3,4 or 5");
                break;
        }

        // challenge 1

        char CharSwitchValue = 'G';
        switch(CharSwitchValue)
        {
            case 'A':
                System.out.println("A was found !");
                break;

            case 'B':
                System.out.println("B was found !");
                break;
            
            case 'C':
                System.out.println("c was found !");
                break;

            case 'D':
                System.out.println("D was found !");
                break;

             case 'E':
                System.out.println("E was found !");
                break;

            default:
                System.out.println("was not A,B,C,D or E");
                break;
            
            
        }

        // challege 2

        String month = "January";
        switch(month.toLowerCase())
    {
        case "january":
            System.out.println("January");
            break;

        case "february":
            System.out.println("February");
            break;

        case "march":
            System.out.println("March");
            break;

        case "april":
            System.out.println("April");
            break;

        default:
            System.out.println("Not sure !");
            break;
        
    }
    }
}