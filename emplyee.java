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
    class emplyee
    {
        public static void main(String[] args) {
            ArrayList<Employee> e=new ArrayList<>();
            e.add(new Employee("Jack Sparrow",1));
            e.add(new Employee("Will Turner",2));
            e.add(new Employee("Elizabeth Swann",3));
            e.add(new Employee("Davy Jones",4));
            for (Employee emp:e)
            {
                System.out.println(emp.name+" "+emp.eid);
            }
            
        }
    }
}