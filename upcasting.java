class  Laptop
{
    double price=50000.0;
    public void Brand()
    {
        System.out.println("Brand: ASUS");
    }
}
class GamingLaptop extends Laptop
{
   int RAM=16;
    public void GamingFeatures()
    {
        System.out.println("Supports high-end gaming");
    }
}
class upcasting
{
    public static void main(String [] args)
    {
        Laptop l=new GamingLaptop();
        l.Brand();
        System.out.println(l.price);

    }
}