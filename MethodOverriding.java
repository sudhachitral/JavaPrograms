


class Car
{
    public void brand()
    {
        System.out.println("Rolls Royse");
    }
}
class Mustang extends Car{
    public void brand()
    {
        System.out.println("Ferrari");
    }
}
class BMW extends Mustang{
    public void brand()
    {

        System.out.println("Porsche");
    }
}

class MethodOverriding
{
    public static void main(String[] args) {
        {
            Car c= new Mustang();
            c.brand();
            Car c1=new BMW();
            c1.brand();
        }
    }
}