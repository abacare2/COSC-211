
/**
 * Anthony Bacarella E01627719
 * Winter 2017 COSC 211-0
 * Project 2
 * The program will do the following:
 * 1) Display seats available.
 * 2) Allow the user to choose a seat.
 * 3) Repeat until a user quits or all seats are filled.
 */
import java.util.Scanner;
public class Program2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String response;
        String identity;
        char [][] seats = new char[8][4];
        
        //assign A B C D to array
        for (int i=0;i < 8;i++)
        {
            for(int k = 0; k < 4; k++)
            {
               seats[i][0] = 'A';
               seats[i][1] = 'B';
               seats[i][2] = 'C';
               seats[i][3] = 'D';
            }
        }
        //Display the seat pattern
        for(int i=0;i<7;i++)
        {
            System.out.println((i+1)+" "+seats[i][0]+" "+seats[i][1]+"  "+seats[i][2]+" "+seats[i][3]);
        }
        
        //Prompt the user.
        System.out.println("Please enter 1 to select a seat.");
        System.out.println("Enter any other number to quit.");
        response = keyboard.nextLine();
        while (response.equals("1"))
          {    
            System.out.println("Please enter your desired seat.");
            identity = keyboard.nextLine();
            
            int rowNum =(int)identity.charAt(0)-49;     //Converts from unicode value to numerical value
            int colNum =(int)identity.charAt(1)-65;

            System.out.println("You have entered: "+seats[rowNum][colNum]+" in row "+ identity.charAt(0));
                if(seats[rowNum][colNum] != 'X')
                {
                    seats[rowNum][colNum] = 'X'; //Replaces the desired seat with an X
                }
                else
                {
                    System.out.println("***Sorry, that seat is already taken.***");
                }
             System.out.println("Displaying updated seat chart: ");
             for(int i=0;i<7;i++)
             {
                System.out.println((i+1)+" "+seats[i][0]+" "+seats[i][1]+"  "+seats[i][2]+" "+seats[i][3]);
             }
        
             System.out.println("Please enter 1 to select a seat.");
             System.out.println("Enter any other number to quit.");
             response = keyboard.nextLine();
           }
        
        System.out.println();
        System.out.println("Program is terminating.");
    }
}
/**
1 A B  C D
2 A B  C D
3 A B  C D
4 A B  C D
5 A B  C D
6 A B  C D
7 A B  C D
Please enter 1 to select a seat.
Enter any other number to quit.
1
Please enter your desired seat.
2C
You have entered: C in row 2
Displaying updated seat chart: 
1 A B  C D
2 A B  X D
3 A B  C D
4 A B  C D
5 A B  C D
6 A B  C D
7 A B  C D
Please enter 1 to select a seat.
Enter any other number to quit.
1
Please enter your desired seat.
4A
You have entered: A in row 4
Displaying updated seat chart: 
1 A B  C D
2 A B  X D
3 A B  C D
4 X B  C D
5 A B  C D
6 A B  C D
7 A B  C D
Please enter 1 to select a seat.
Enter any other number to quit.
5

Program is terminating.

 */