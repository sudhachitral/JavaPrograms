import java.util.*;
class Employee
{
    String name;
    int id;
     int  salary;
    Employee(String name,int id, int salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String toString()
    {
        return "name: "+name+"  id: "+id+"  salary:  "+salary;
    }

}
class NameSort implements Comparator<Employee>
{
   
    public int compare(Employee e1,Employee e2)
    {
        return e1.name.compareTo(e2.name);
   }
}
class IdSort implements Comparator<Employee>
{
  
    public int compare(Employee e3,Employee e4)
    {
        return e3.id-e4.id;
    }
}
class SalarySort implements Comparator<Employee>
{
   
    public int compare(Employee e5,Employee e6)
    {
        return e5.salary-e6.salary;
    }
}
class EmployeeSort
{
    public static void main (String args[])
    {
        ArrayList<Employee> e=new ArrayList<>(Arrays.asList(new Employee("Reddy",1,10000),new Employee("Chowdary",2,20000),new Employee("Khans",3,15000),new Employee("Kshatriya",4,50000)));
        for (Employee ele:e)
        {
            System.out.println(ele);
        }
        Collections.sort(e, new NameSort());
        System.out.println(e);
        Collections.sort(e,new IdSort());
        System.out.println(e);
        Collections.sort(e,new SalarySort());
        System.out.println(e);
    }
}
