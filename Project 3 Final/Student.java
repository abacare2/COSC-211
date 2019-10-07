/**
 * Anthony Bacarella, COSC 211-0, Winter 2017, Project 3
 * The program will allow users to:
 * 1. imput data for 5 students
 * 2. sort the students according to test score averages.
 */
import java.util.Scanner;
public class Student extends Person
{
   int test1;
   int test2;
   double avgScore;
   char grade;
   public Student(String a, int b, int c, int d) //Main Constructor
   {
       super(a,b);
       test1=c;
       test2=d;
       avgScore= (double)(c+d)/2;       //Average = Sum of all scores divided by amount of scores
       grade = setGrade();
   }
   public double getScore()
   {
       return this.avgScore;
    }
   public int getTest1()
   {
       return test1;
   }
   public int getTest2()
   {
       return test2;
   }
   public void setTest1(int test1)
   {
       this.test1=test1;
    }
   public void setTest2(int test2)
   {
       this.test2=test2;
    }  
   public boolean equals(Student otherStudent)
   {
        return (otherStudent.name.equals(name) && otherStudent.id == id);
   }
   public String toString()
   {
       return super.toString() + "\nAvg Test Score = " + getScore()+"\nGrade = "+ grade + "\n";
    }
   
   public char setGrade()
   {
       if(avgScore >=90)
        {
            grade = 'A';
        }
        else if (80 <= avgScore && avgScore < 90)
        {
            grade = 'B';
        }
        else if (70 <= avgScore && avgScore < 80)
        {
            grade = 'C';
        }
        else if (60 <= avgScore && avgScore < 70)
        {
            grade = 'D';
        }
        else 
        {
            grade = 'E';
        }
        return grade;
    }
    
}
