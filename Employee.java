public abstract class Employee{
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
    public abstract  double BonusSalary();
    public abstract double CalculateTotalSalary();



}
class Manager extends Employee{
    Manager(int empid,String name,double bonussalary)
    {
        super(empid,name,bonussalary);
    }
    public double CalaculateBonus(int bonus)
    
    {
return basesalary*bonus;
    }
    public double CalculateTotalSalary()
    {
        return basesalary+CalaculateBonus(10);
    }
    public double BonusSalary()
    {
        return CalaculateBonus(10);
    }
    public double getTotalSalary()
    {
        return CalculateTotalSalary();
    }

}
class Developer extends Employee{
    Developer(int empid,String name,double basesalary)
    {
        super(empid,name,basesalary);
    }
    public double CalaculateBonus(int bonus)
    
    {
        return basesalary*bonus;
    }
    public double CalculateTotalSalary()
    {
        return basesalary+CalaculateBonus(5);
    }
     public double BonusSalary()
    {
        return CalaculateBonus(10);
    }
    public double getTotalSalary()
    {
        return CalculateTotalSalary();
    }

}
class EmployeePayrollSystem
{
    public static void main(String[] args)
    {
        Manager m=new Manager(1,"Jack Sparrow",50000);
        Developer d =new Developer(2,"will Turner",400000);
        System.out.println("manager name and id:"+m.getname()+" "+m.getEmpid());
    }
}