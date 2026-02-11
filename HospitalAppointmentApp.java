abstract class Appointment
{
    int appointmentId;
    String patientName;
    double consultantfee;
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
        return Diagonisticcharge()+calculateGST();
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
public class HospitalAppointmentApp
{
    public static void main (String args[])
    {
Generaldoctor g=new Generaldoctor(1,"sai",200);
System.out.println("----------------General Doctor------------------");
System.out.println("General Doctor Diagonistic Charge: "+g.Diagonisticcharge());
g.display();
System.out.println("----------------Specialist Doctor------------------");
Specialistdoctor s=new Specialistdoctor(2,"Tom",150);
System.out.println("Specialist Doctor Diagonistic Charge: "+s.Diagonisticcharge());
s.display();
System.out.println("----------------Surgical Doctor------------------");
Surgeondoctor su=new Surgeondoctor(3,"Jerry",300);
System.out.println("Surgical Doctor Diagonistic Charge: "+su.Diagonisticcharge());
su.display();


    }
}