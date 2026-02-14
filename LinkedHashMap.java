import java.util.*;
class LinkedHaspMapExample
{
    public static void main (String args[])
    {
        LinkedHashMap<Integer,Integer> l=new LinkedHashMap<>();
        l.put(1,10);
        l.put(2,20);
        l.put(3,30);
        l.put(4,40);
        System.out.println(l);
        System.out.println("-------------------------------ACESSING-------------------------------");
        System.out.println("get key 1: "+l.get(1));
        System.out.println("printing all keys: "+l.keySet());
        System.out.println("accessing all the valus: "+l.values());
        System.out.println("accessing both keys and values: "+l.entrySet());
        System.out.println("using for each loop");
        for (Map.Entry<Integer,Integer> l1:l.entrySet())
        {
System.out.println(l1.getKey()+" "+l1.getValue());
        } 
System.out.println("-----------------------------SEARCHING----------------------------");
System.out.println(l.containsKey(2));
System.out.println(l.containsKey(30));
System.out.println("---------------------------------------REMOVING--------------------------");
System.out.println("removing 30 : "+l.remove(3));
System.out.println(l);

        



    }
}
