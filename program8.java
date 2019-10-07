/*
 * Anthony Bacarella,COSC 211-0, Winter 2017. Project 8
 * This program should
 * 1) Read in the size of an integer array as well as it's elements
 * 2) Return True or False whether the array is a palindrome or not
 */
import java.util.Scanner;
public class program8 
{
	public static boolean forwardsEqualsBackwards(int[]a,int first, int last)	//recursive method accepts array, and pointers on left and right end
	{
		if(first >= last)	//when the pointers cross the array is a palindrome
			return true;
		else 
		{
			return (a[first] == a[last]) && forwardsEqualsBackwards(a,first+1,last-1);	//return false if the array is not equal at both pointers, otherwise, increment pointers 
		}
	}
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the array length, followed by integers to fill the array: ");	//prompt user for input
		int size = keyboard.nextInt();
		int a[] = new int[size];		//initialize array to the input size
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = keyboard.nextInt();	//fill the array with user input
		}
		if (forwardsEqualsBackwards(a,0, size-1) == true) // If the method returns true
		{
			System.out.println("The elements of the array are the same forwards and backwards.");
		}
		else
		{
			System.out.println("The elements of the array are NOT the same forwards and backwards");
		}
	}
}
/*
 * Please enter the array length, followed by integers to fill the array: 
3
11 22 11
The elements of the array are the same forwards and backwards.
*/
