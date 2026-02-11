import java.util.*;
class Employee
{
    String name;
    int eid;
    Employee(String name,int eid)
    {
        this.name=name;
        this.eid=eid;
    }
    @Override
    public String toString()
    {
        return "empname:  "+name+"  empid: "+eid;
    }
}
    class EmployeMain
    {
        public static void main(String[] args) {
            ArrayList<Employee> e=new ArrayList<>();
            e.add(new Employee("Jack Sparrow",1));
            e.add(new Employee("Will Turner",2));
            e.add(new Employee("Elizabeth Swann",3));
            e.add(new Employee("Davy Jones",4));
            System.out.println(e);
            for (Employee emp:e)
            {
                System.out.println(emp);
            }
         Iterator<Employee>e1=e.iterator();
         System.out.println("Iterator method");
         while(e1.hasNext())
            {
                System.out.println(e1.next());
            }   
            ListIterator<Employee> e2=e.listIterator();
            System.out.println("ListIterator method");
            while(e2.hasNext())
            {
                System.out.println(e2.next());
            }
            System.out.println("reverse traversal");
            while(e2.hasPrevious())
            {
                System.out.println(e2.previous());
            }
            for(int x=0;x<e.size();x++)
            {
                System.out.println(e.get(x));
            }
             for(int x=e.size()-1;x>=0;x--)
            {
                System.out.println(e.get(x));
            }

        }
    }
