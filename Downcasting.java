class Food
{
    int cost=20;
    public void tast()
    {
        System.out.println("Good");
    }
}
class Hostel extends Food 
{
int count=100;
public void time()
{
    System.out.println("8PM");
}
}
class Downcasting{
    public static void main(String[] args) {
        {
            Food f =new Hostel();
            Hostel h = (Hostel)f;
            f.tast();
            h.time();
            System.out.println(f.cost);
            System.out.println(h.count);
        }
    }
}