abstract class Carona
{
    //public abstract void Mask();
    public abstract void Sanitize();


}
class Covid19 extends Carona{
    public void Sanitize()
    {
        System.out.println("Sanitize ");
    }
}
class Wave1 extends Carona{
    public void Sanitize()
    {
        System.out.println("Sanitize your hands");
    }
}

class Wave2 extends Wave1
{
    public void Sanitize()
    {
        System.out.println("Sanitize a lot");
    }
}
class Abstraction
{
    public static void main(String args[])
    {
        Carona c =new Covid19();
        c.Sanitize();
      
        Carona w= new Wave2();
        w.Sanitize();
    }
}