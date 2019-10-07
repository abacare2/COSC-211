/*
 * Anthony Bacarella,COSC 211-0, Winter 2017. Project 6
 * The program should
 * 1) Generate 20 random numbers between 1 and 50, then write them to a binary file.
 * 2) Read the numbers back from the file to display them with the frequency of occurrence.
 */

import java.io.*;
import java.util.Arrays;
import java.util.Random;
public class program6 
{

	public static void main(String[] args) throws IOException
	{
        DataInputStream inputStream = null;
        DataOutputStream outputStream = null;
        int random[] = new int[20];
        int retrieved[] = new int [20];
        int match[] = new int[20];
        int num[] = new int[20];
        Random randInt = new Random();
        
        try
        {
        	outputStream = new DataOutputStream(new FileOutputStream("data.dat"));	//telling the data output where to go
        	System.out.println("File loaded Successfully.");
        }
        catch(FileNotFoundException e)
        {
           System.out.println("Problem opening file. \n Program closing...");
           System.exit(0);
        }
        for(int i = 0; i <= 19; i++)
        {
        	int value = randInt.nextInt(49)+1;	//Creates random numbers between 1 and 50	
        	random[i] = value;			/Stores the random numbers in an array
        }
        for(int i = 0; i <= 19; i++)
        {
        	outputStream.writeInt(random[i]);	//writes the contents of the array to the binary file loaded in outputStream
        }
        outputStream.close();
        //Generated numbers and wrote to file. Next we read them and keep track of how many times each number shows up.
        try
        {
        	inputStream = new DataInputStream(new FileInputStream("data.dat"));//load the file
        	System.out.println("File loaded Successfully.");
        }
        catch(FileNotFoundException e)
        {
           System.out.println("Problem opening file. \n Program closing...");
           System.exit(0);
        }
        try
        {
        		for (int i= 0; inputStream.available() > 0;i++)	//this will loop until no data is available
        		{
        			int loadedNum = inputStream.readInt();
        			retrieved[i] = loadedNum;
        		}
        		Arrays.sort(retrieved);				//quickly sorts the array in an ascending order
        		for (int i = 0; i<retrieved.length;i++)		//loops through the array "retrieved"
        		{
        			int arrayValue = retrieved[i];		//assigns the current array value to the variable "arrayValue"
        			for(int k=0; k<retrieved.length; k++)	//loops through the retrieved array one time for each index
        			{
        				int compare = retrieved[k];	//assigns the current array value to "compare"
        				if(arrayValue == compare)	//this will compare every value in the array, 
        				{
        					match[i] = match[i]+1;	//counts the amount of iterations for each array index
        					num[i] = retrieved[i];
        				} 
        			}
        		}
        }
        catch(EOFException e)
        {
        	System.out.println("End of File reached.");
        }
        inputStream.close();
        System.out.println("Listing as: Value / Frequency of occurrence");
        for(int i = 0; i < retrieved.length; i++)
        {
        	if(i != 19 && retrieved[i] != retrieved[i+1])	//Will not display duplicate numbers
        	{
        	System.out.println(retrieved[i]+" / "+match[i]);//display the array values and iterations.
        	}
        	if(i == 19 && retrieved[i] != retrieved[i-1])
        	{
        		System.out.println(retrieved[i]+" / "+match[i]);
        	}
        }
	}
}
/*
 * File loaded Successfully.
File loaded Successfully.
Listing as: Value / Frequency of occurrence
11 / 1
12 / 1
13 / 1
14 / 1
21 / 2
22 / 1
23 / 1
25 / 1
29 / 1
31 / 1
32 / 1
35 / 2
40 / 1
42 / 1
47 / 3
48 / 1
*/
