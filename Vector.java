import java.util.*;
class StringVector
{
    public static void main(String [] args)
    {
        Vector<String> v=new Vector<>();
        v.add("Durander");
        v.add("ujair");
        v.add("Rehman Dakait");
        v.add("Yalin");
        System.out.println(v);
        Vector<String> v1=new Vector<>();
        v1.add("RanVijay");
        v1.add("ujair");
        v1.add("Arjun Reddy");
        v1.add("preethi");
        v1.add("geetanjali");
        v1.add("zoya");
       
        v.add(2,"Donga");
         System.out.println(v);
         v.addAll(4,v1);
          System.out.println(v);
          System.out.println("-------ACESSING ELEMENTS---------------");
          for(String ele:v)
{
    System.out.println(ele);
}
Iterator<String> v2= v.iterator();
while(v2.hasNext())
{
    System.out.print(v2.next());
}
ListIterator<String> v3=v.listIterator(3);
while(v3.hasNext())
{
    System.out.println(v3.next());

}
System.out.print("REVERSE");
ListIterator<String> v4=v.listIterator(v.size());

while(v4.hasPrevious())
{
    System.out.println(v4.previous());
}
System.out.println(v.get(4));
System.out.println("------------------REMOVE---------------------");
v.remove("ujair");
System.out.println("ujair removed"+v);
v.remove(3);
System.out.println("index 3 removed"+v);
v.removeAll(v1);
System.out.println("v1 removed from v"+v);
v.retainAll(v1);
System.out.println("v1 retained"+v);
v1.clear();
System.out.println("v cleard"+v);
System.out.println(v.isEmpty());
System.out.println("-------------------SORTING----------------------------");
v.add("Seetha");
v.add("Ram");
Collections.sort(v);
System.out.println(v);
Collections.reverse(v);

System.out.println(v);
System.out.println("----------------------------SEARCHING_-------------------------------");
System.out.println(v.contains("Ram"));
System.out.println("contains all v1 in v"+v.containsAll(v1));
System.out.print("index of object"+v.indexOf("Seetha"));
System.err.println("last index of"+v.lastIndexOf("Ram"));




    }
}
    
