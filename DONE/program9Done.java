//New class program9 containing main
import java.util.Scanner;
public class program9
{
	public static void main(String[] args)	
	{
		boolean exit = false;
		int response;
		Scanner keyboard = new Scanner (System.in);
		LinkedList L = new LinkedList();
		
		while (exit != true)	//loop until the user wants to exit
		{
			System.out.println();
			System.out.println("    ---------------------- MENU ----------------------");
			System.out.println("1. Insert an ID to beginning.     2. Insert an ID to the end.");
			System.out.println("3. Display the length. 		  4. Search for an ID.");
			System.out.println("5. Delete an ID. 		  6. Print the list. \n7. Exit");
			response = keyboard.nextInt();

			if (response == 1)
			{
				System.out.println("Enter an ID to add to the start of the list: ");	//prompt user
				int a = keyboard.nextInt();
				L.addToStart(a);	//call the method
				System.out.println("Added "+a+" to start of list");
			}		
			if (response == 2)
			{
				if(L.size()<1)	//to avoid pointer exceptions we can simply add the number to the start of the list if list is empty
				{
					System.out.println("Enter an ID to add to the end of the list: ");
					int a = keyboard.nextInt();
					L.addToStart(a);
					System.out.println("Added "+a+" to end of list.");
				}
				else
				{
					System.out.println("Enter an ID to add to the end of the list: ");
					int a = keyboard.nextInt();
					L.addToEnd(a);
					System.out.println("Added "+a+" to end of list.");
				}
			}		
			if (response == 3)
			{
				System.out.println("The list contains: "+L.size()+" ID(s).");
			}		
			if (response == 4)
			{
				System.out.println("Search for an ID in the list: ");
				int a = keyboard.nextInt();
				if(L.contains(a) == true)		//if statement for better output rather than "true" or "false"
				{
					System.out.println("The ID "+a+" was found.");
				}
				else
				{
					System.out.println("The ID "+a+" was not found.");
				}	
			}		
			if (response == 5)
			{
				System.out.println("Enter an ID to delete.");
				int a = keyboard.nextInt();
				L.deleteNode(a);
				System.out.println("ID "+a+" was removed.");
			}			
			if (response == 6)
			{
				System.out.println("Printing List: ");
				L.printList();
			}		
			if (response >= 7)
			{
				exit = true;
			}
		}	//end of while loop
		System.out.println("Exiting program...");
		System.exit(0);
	}
}