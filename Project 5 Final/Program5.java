/*
 * Anthony Bacarella,COSC 211-0, Winter 2017. Project 5
 */
import java.io.*;
import java.util.*;
public class Program5 
{
    public static void main(String[] args) 
    {
    	Scanner keyboard = new Scanner(System.in);
        Scanner inputStream = null;
        Scanner secondStream = null;
        int next = 0, sum = 0;
        String fileName;
        String line = null;
        int count = 0;
        
        System.out.println("Please enter the name of a file: ");
        fileName = keyboard.next();
        
        try
        {
            inputStream = new Scanner(new FileInputStream (fileName)); 		//need two file inputs, first to count the total lines
            secondStream = new Scanner(new FileInputStream(fileName));		//second is do add the integers
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Problem opening file. \n Program closing...");
           System.exit(0);
        }
 
        while(inputStream.hasNextLine())		//counts total lines
        {
            count++;
            inputStream.nextLine();
        }
        System.out.println("File loaded Successfully. \n"+count+" total lines.");
        System.out.println("Entering Loop...");
               
        while(secondStream.hasNextLine())		//Loops until the end of file
                {       
                    try
                    {
                    	line = secondStream.next();
                        next = Integer.parseInt(line);
                        sum = sum + next;                  
                    }
                    catch(InputMismatchException e)
                    {
                    	
                    }
                    catch(NumberFormatException e)
                    {
                       
                    }
                    //System.out.println("sum = "+sum);		//was used to check program
                }
        inputStream.close();
        secondStream.close();
        System.out.println("The sum of the integers in \"inputP5\" is: "+sum);
    }
}
/*
 * Please enter the name of a file: 
inputP5.txt
File loaded Successfully. 
5 total lines.
Entering Loop...
The sum of the integers in "inputP5" is: 21
 */