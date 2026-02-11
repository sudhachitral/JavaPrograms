import java.util.*;
class Student
{
    String name;
    int id;
    Student(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
       public String toString()
       {
        return "name: "+name+" id: "+id;
       }
}
class Arrylistclass
{
    public static void main(String [] args)
    {
        ArrayList<Student> s=new ArrayList<>();
        s.add(new Student("Alice", 1));
        s.add(new Student("Bob", 2));
        s.add(new Student("Charlie", 3));
        System.out.println(s.toString());
        System.out.println(s);

    
    }
}