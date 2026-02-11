import java.util.*;
abstract class Appointment
{
   protected int appointmentId;
    protected String patientName;
   protected double consultantfee;
    Appointment(int appointmentId,String patientName,double consultantfee )
    {
        this.appointmentId=appointmentId;
        this.patientName=patientName;
        this.consultantfee=consultantfee;

    }

    public int getAppointmentId() {
        return appointmentId;
    }
    public String getPatientName()
    {
        return patientName;
    }
    public double getConsultantFee()
    {
return consultantfee;
    }
    public abstract double Diagonisticcharge();
    public double calculateGST()
    {
        return consultantfee*3.0;
    }
    public double calculateTotal()
    {
        return calculateGST();
    }
    public void display()
    {
        System.out.println("APPOINTMENT ID: "+getAppointmentId());
        System.out.println("PATIENT NAME: "+getPatientName());
        System.out.println("CONSULTANTFEE: "+getConsultantFee());
        System.out.println("GST: "+calculateGST());
        System.out.println("TOTAL: "+calculateTotal());
    }
}

    class Generaldoctor extends Appointment
    {
        Generaldoctor(int appointmentId,String patientname,double consultantfee)
        {
            super(appointmentId,patientname,consultantfee);

        }
        public double Diagonisticcharge()
        {
            return consultantfee*0.5;
        }
    }

class Specialistdoctor extends Appointment
{
    Specialistdoctor(int appointmentId,String patientname,double consultantfee)
    {
        super(appointmentId,patientname,consultantfee);

    }
    public double Diagonisticcharge()
    {
        return consultantfee*0.8;
    }
}
class Surgeondoctor extends Appointment
{
    Surgeondoctor(int appointmentId,String patientname,double consultantfee)
    {
        super(appointmentId,patientname,consultantfee);

    }
    public double Diagonisticcharge()
    {
        return consultantfee*1.0;
    }
}
public class Switchmethod
{
    public static void main (String args[])
    {
        System.out.println("choose 1: To consult General Doctor");
        System.out.println("choose 2: To consult Specialist doctor");
        System.out.println("choose 3: To consult Surgeon doctor");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice:");
        int ch=sc.nextInt();
        System.out.println("enter your name");
        String patientName=sc.next();
        System.out.println("enter your id");
        int appointmentId=sc.nextInt();
        System.out.println("enter consultant fee");
        double consultantfee=sc.nextDouble();
        switch(ch){
            case 1:
                Generaldoctor g=new Generaldoctor(g.patientName,g.appointmentId,g.consultantfee);
System.out.println("----------------General Doctor------------------");
System.out.println("General Doctor Diagonistic Charge: "+g.Diagonisticcharge());
g.display();
break;
case 2:
    System.out.println("----------------Specialist Doctor------------------");
Specialistdoctor s=new Specialistdoctor(2,"Tom",150);
System.out.println("Specialist Doctor Diagonistic Charge: "+s.Diagonisticcharge());
s.display();
break;
case 3:
    System.out.println("----------------Surgical Doctor------------------");
Surgeondoctor su=new Surgeondoctor(3,"Jerry",300);
System.out.println("Surgical Doctor Diagonistic Charge: "+su.Diagonisticcharge());
su.display();
break;
default: System.out.println("invalid choice");

        }







    }
}