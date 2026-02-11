abstract class Employee{
   protected int empid;
   protected  String name;
    protected double basesalary;
    Employee(int empid,String name,double basesalary)
    {
        this.empid=empid;
        this.name=name;
        this.basesalary=basesalary;
    }
    public int getEmpid()
    {
        return empid;
    }
    public String getname()
    {
        return name;
    }
    public double getbonus()
    {
        return basesalary;
    }
    public abstract  double CalculateBonus();
    public abstract double CalculateTotalSalary();



}
class Manager extends Employee{
    Manager(int empid,String name,double bonussalary)
    {
        super(empid,name,bonussalary);
    }
    // @Override
//     public double CalaculateBonus()
    
//     {
// return basesalary;
//     }
@Override
public double CalculateBonus(){
    return basesalary;
}
    @Override
    public double CalculateTotalSalary()
    {
        return basesalary;
    }
   
   
}
class Developer extends Employee{
    Developer(int empid,String name,double basesalary)
    {
        super(empid,name,basesalary);
    }
//    @Override

public  double CalculateBonus(){
    return basesalary;
}
//    public double CalaculateBonus()
//    {
//     return basesalary;
//    }
    public double CalculateTotalSalary()
    {
        return basesalary;
    }
     
   

}
class EmployeePayrollSystem
{
    public static void main(String[] args)
    {
        Manager m=new Manager(1,"Jack Sparrow",50000);
        Developer d =new Developer(2,"will Turner",400000);
        System.out.println("manager name and id:"+m.getname()+" "+m.getEmpid());
        // System.out.println("manager bonus salary: "+m.CalaculateBonus());
        System.out.println("developer name and id:"+d.getname()+" "+d.getEmpid());
        System.out.println("developer bonus salary: "+d.CalculateBonus());
        // System.out.println(m.getTotalSalary());
        System.out.println("Manager");
        System.out.println(m.CalculateBonus());

        System.out.println(m.CalculateTotalSalary());
        System.out.println("Developer");
        System.out.println(d.CalculateTotalSalary());
                System.out.println(d.CalculateBonus());
        
    }
}