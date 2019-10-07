
/**
 * Cosc 111 Review - A simple class with the following methods
 * 1. Three constructors - Default, paramater, copy
 * 2. Two accessor methods - getName, getID
 * 3. Four mutator methods - setName(string), setID(int),setName (Person,String), SetId(Person,int)
 * 4. One toString method.
 * 
 * Anthony Bacarella 
 * 1.10.17
 */
public class Person
{
    private String name;
    private int id;
    
    public Person()// default constructor
    {
        name = "default";
        id = 0;
    }
    public Person(String newName, int newId) //paramaterized
    {
        name = newName;
        id = newId;
    }
    public Person(Person otherPerson) //copy
    {
        name = otherPerson.name;
        id = otherPerson.id;
    }
        
    
    public void setName(String name)
    {
        this.name=name;
    }
    public static void setName(Person p, String newName)
    {
        p.name =newName;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public static void setId(Person p,int newId)
    {
        p.id =newId;
    }
    public int getId()
    {
        return id;
    }
    
    public boolean equals(Person otherPerson)
    {
        return (otherPerson.name.equals(name) && otherPerson.id == id);
    }
    
    public String toString()
    {
        return ("Name= " +name+"\n ID= "+id);
    }
    
    public static void main(String[] args)
  {
    
    Person p1=new Person("Tom",1111);
    System.out.println(p1);
    
    Person p2=new Person("Mary",2222);
    System.out.println(p2);
    
    Person p3=new Person(p2);
    System.out.println(p3);
    
    if(p2.equals(p3))
    {
        System.out.println("Persons p2 and p3 are equal");
    }
        else 
    {
        System.out.println("Persons p2 and p3 are unequal");
    }
        System.out.println("Persons p1 and p2 are being modified:");
        
        Person.setId(p1,1234);
        p1.setName("Jim");
        System.out.println(p1);
        
        p2.setId(1234);
        Person.setName(p2,"Jimmy");
        System.out.println(p2);
        
        
    if(p1.getName().equals(p2.getName()))
        {
            System.out.println("Persons p1 and p2 have the same names");
        }
            else 
            {
                System.out.println("Persons p1 and p2 have different names");
            }
    if(p1.getId()==p2.getId())
    {
        System.out.println("Persons p1 and p2 have the same id");
    } 
        else
        {
        System.out.println("Persons p1 and p2 have different id");
        }
    }
}

/**
 * 
Name= Tom
 ID= 1111
Name= Mary
 ID= 2222
Name= Mary
 ID= 2222
Persons p2 and p3 are equal
Persons p1 and p2 are being modified:
Name= Jim
 ID= 1234
Name= Jimmy
 ID= 1234
Persons p1 and p2 have different names
Persons p1 and p2 have the same id

 */