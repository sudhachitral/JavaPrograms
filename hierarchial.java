class Avengers
{
    int count=20;
    public void nick(){
        System.out.println("Avengers start");
    }
}
class Infinity extends Avengers{
    int alive=5;
    public void boxoffice()
    {
         System.out.println("20000");
    }
}
class endgame extends Avengers{
    int dead=1;
    public void rating()
    {
         System.out.println("9.2");
    }

}
class hierarchial
{
    public static void main(String [] args)
    {
        Avengers a =new Avengers();
         System.out.println(a.count);
         a.nick();
         Infinity i=new Infinity();
         i.boxoffice();
          System.out.println(i.count);
          endgame e = new endgame();
          e.rating();
           System.out.println(e.count+" "+e.dead);
    }
}