/**
 * Anthony Bacarella, COSC 211-0, Winter 2017, Project 3
 * The program will allow users to:
 * 1. imput data for 5 students
 * 2. sort the students in ascending order according to test score averages.
 */
import java.util.Scanner;
public class Program3 extends Person
{
   public static void main(String[] args)
    {    
        char grade;
        Student[] x = new Student[5];
        String name;
        int id;
        int test1;
        int test2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter Name, ID, and two Test scores for 5 students: ");
        for(int i = 0; i<5; i++)        //allows users to enter Student info
        {
            System.out.println();
            System.out.print("Name: ");
            name = keyboard.next();
            System.out.print("ID: ");
            id = keyboard.nextInt();
            System.out.print("Score 1: ");
            test1 = keyboard.nextInt();
            System.out.print("Score 2: ");
            test2 = keyboard.nextInt();
            x[i] = new Student(name,id,test1,test2);//the info is being entered as a Student object
        }
        arraySort(x);   // call the method to sort array x
        System.out.println();
        System.out.println("Students displayed in ascending order according to Avg test score: ");
        System.out.println();
        for(int i = 0;i<5; i++)
        {
            System.out.println(x[i]);
            System.out.println("-------------------");
        }
    }
    public static void arraySort(Student[] avg) // sort array in ascending order based off avgScore
        {
            Student[] temp = new Student[5];
            int minValue;
            for(int i = 0; i< avg.length-1; i++)
            {
                minValue=i;
                for(int k = minValue + 1;k < avg.length; k++)
                {
                    if (avg[k].getScore() < avg[minValue].getScore())      //swaps the location of the array objects
                    {
                        minValue = k;
                        temp[0] = avg[minValue];
                        avg[minValue] = avg[i];
                        avg[i] = temp[0];
                     }
                    }
                }
            }
}

/**
 * Please enter Name, ID, and two Test scores for 5 students: 

Name: Bob 50 80 80
ID: Score 1: Score 2: 
Name: Jim 12 100 100
ID: Score 1: Score 2: 
Name: Bill 341 70 70
ID: Score 1: Score 2: 
Name: Cam 343 0 100
ID: Score 1: Score 2: 
Name: Hank 3456 50 90
ID: Score 1: Score 2: 
Students displayed in ascending order according to Avg test score: 

Name= Cam
ID= 343
Avg Test Score = 50.0
Grade = E

-------------------
Name= Hank
ID= 3456
Avg Test Score = 70.0
Grade = C

-------------------
Name= Bill
ID= 341
Avg Test Score = 70.0
Grade = C

-------------------
Name= Bob
ID= 50
Avg Test Score = 80.0
Grade = B

-------------------
Name= Jim
ID= 12
Avg Test Score = 100.0
Grade = A

-------------------
**/
