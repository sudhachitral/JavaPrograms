// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Veggies{
    String name;
    int price;
    Veggies(String name,int price)
    {
        this.name=name;
        this.price=price;
    }
    public String toString()
    {
        return "name:  "+name+" "+ "price:  "+price;
    }
    public boolean equals(Object o)
    {
        Veggies v2=(Veggies) o;
        return this.name.equals(v2.name) && this.price==v2.price;

    }
}
class SearchingArrayListClass
{
    public static void main(String args[])
    {
        ArrayList<Veggies> v=new ArrayList<>();
        v.add(new Veggies("Tomato",50));
        v.add(new Veggies("Potato",50));
     v.add(new Veggies("onion",50));
     v.add(new Veggies("Chillies",60));
        System.out.println(v);
        Veggies v1=new Veggies("onion",50);
        System.out.println(v.contains(v1));
        System.out.println(v.indexOf(v1));
        System.out.println(v.lastIndexOf(v1));
        ArrayList<Veggies> v3=new ArrayList<>();
        v3.add(new Veggies("Bottle Gourd",50));
        v3.add(new Veggies("Biiter gourd",100));
        v3.add(new Veggies("okra",80));
        v3.add(new Veggies("Beans",90));
        ArrayList<Veggies> v4=new ArrayList<>();
        v4.add(new Veggies("Tomato",50));
        v4.add(new Veggies("Potato",50));
     v4.add(new Veggies("onion",50));
     v4.add(new Veggies("Chillies",60));
        System.out.println(v3.containsAll(v4));
        


    }
}