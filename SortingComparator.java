import java.util.*;
class Chocolate 
{
    String name;
    int price;
    Chocolate(String name,int price)
    {
this.name=name;
this.price=price;
    }
    @Override
    public String toString()
    {
return "name:  "+name+"  price:  "+price;
    }    
}
class NameSort implements Comparator<Chocolate>
{
    @Override
public int compare(Chocolate c1,Chocolate c2)
{
return c1.name.compareTo(c2.name);
}
}
class priceSort implements Comparator<Chocolate>
{
    @Override
    public int compare(Chocolate c3,Chocolate c4)
    {
        return c3.price-c4.price;
    }
}
class SortingComparator{
    public static void main(String args[])
    {
ArrayList<Chocolate> c=new ArrayList<>(Arrays.asList(new Chocolate("Snickers",10),new Chocolate("Ferroro Rocher",150),new Chocolate("Kit Kat",5),new Chocolate("Dairy Milk",45)));
for(Chocolate ele:c)
{
    System.out.println(ele);
}
Collections.reverse(c);
System.out.println(c);
Collections.sort(c,new NameSort());
System.out.println(c);
Collections.sort(c,new priceSort());
System.out.println(c);

    }
}
