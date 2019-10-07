
/**
 * Anthony Bacarella, COSC 211-0, Winter 2017, Project 4
 * 
 * This program should:
 * 1. Convert a time from 24-hour format to 12-hour format
 * 2. Throw, catch, and handle a TimeFormatException.
 */
import java.util.Scanner;
import java.util.*;
public class TimeConvert extends TimeFormatException
{  
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int x = 0;
        int y = 0;
        int z = 0;
        String choice = "";
        String time = "";
        while(!done)
        {
            System.out.println("Enter time in 24-hour notation: ");     //Prompt the user for input
            try
            {
                time = keyboard.next();                             //convert the string time to int
                if (time.length() < 5)                              //ensures 24 hour time format
                {
                    time = ("0"+time);                              
                }
                x = Integer.parseInt(time.substring(0,2));
                y = Integer.parseInt(time.substring(3,4));
                z = Integer.parseInt(time.substring(4));
                if(x >= 24)                                         //Number is too large
                {
                    throw new TimeFormatException();
                }
                if(y >= 6)                                          //Minute is more than 60
                {
                    throw new TimeFormatException();
                }
                System.out.println("That is the same as: ");
                System.out.println(TimeConvert.convert(x,y,z));       //call conversion method
                System.out.println("Again? (y/n)");
                choice = keyboard.next();
                if(choice.charAt(0) == 'n')                         //Exit when user decides
                {
                    System.out.println("End of Program");
                    done = true;
                }
            }
                catch (StringIndexOutOfBoundsException e)
                {
                    System.out.println("Input is not a valid time");
                    keyboard.nextLine();
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Input is not a valid time");
                    keyboard.nextLine();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Input is not a valid time");
                    keyboard.nextLine();
                }
                catch (TimeFormatException e)
                {
                    System.out.println(e.getMessage());
                    System.out.println("You entered: "+x);
                }
            }
        }
    public static String convert(int x, int y, int z)
    {
        int hour;
        int tens = y;
        int minute = z;
        String sun = " AM";
        if (x > 12)                     //pm time
        {
            hour = x-12;
            sun = " PM";
        }
        else if (x == 00)               //special case 12:00 am
        {
            hour = 12;
        }
        
        else if (x == 12)           //special case 12:00 pm
        {
            hour = x;
            sun = " PM";
        }
        else 
        {
            hour = x;
        }
        String ans = (hour+":"+tens+minute+sun);
        return ans;
    }
}
/**
 * Enter time in 24-hour notation: 
adjsdf
Input is not a valid time
Enter time in 24-hour notation: 
24340
Input is not a valid time.
You entered: 24
Enter time in 24-hour notation: 
2:00
That is the same as: 
2:00 AM
Again? (y/n)
y
Enter time in 24-hour notation: 
02:00
That is the same as: 
2:00 AM
Again? (y/n)
y
Enter time in 24-hour notation: 
6:24
That is the same as: 
6:24 AM
Again? (y/n)
n
End of Program
 */