/*
 * Anthony Bacarella,COSC 211-0, Winter 2017. Project 7
 * This program should
 * 1) Read in an integer as well as a digit
 * 2) Return the frequency of occurrence of a particular digit in an integer
 */
import java.util.Scanner;
public class program7 
{
	public static int frequencyCount(int n, int d)
	{
		//System.out.println(n/10+","+n%10);	//testing output
		if(n < 10)			//reached the first number
		{	
			if (n == d)
			return 1;		//clearing n and adding 1 for the first occurrence
			else
				return 0;	// clearing n
		}
		else 				//everything besides the first number
		{
			if(n%10 == d)			//if the last number in n is equal to d
			{
				//System.out.println("total+1");	//testing output
				return frequencyCount(n/10,d)+1;	//adds 1 to the value 
			}
			else
				return frequencyCount(n/10,d);		//continue without adding
		}
	}
	public static void main(String[] args)
	{
		int n;
		int d;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a large integer, followed by a single digit integer: ");
		n = keyboard.nextInt();
		d = keyboard.nextInt();
		System.out.println(frequencyCount(n,d));
	}
}
