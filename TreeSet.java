import java.util.*;
class TreeSetInteger
{
    public static void main(String args[])
    {
        TreeSet<String> t=new TreeSet<>();
        t.add("srinivasa");
        t.add("sreedevi");
        t.add("bhoodevi");
        t.add("bramha");
        System.out.println("displaying t:  "+t);
        TreeSet<String> t1=new TreeSet<>();
        t1.add("shiva");
        t1.add("parvathi");
        t1.add("vinayaka");
        t1.add("shanmukha");
        System.out.println("displaying t1:  "+t1);
        t.addAll(t1);
        System.out.println("adding t and t1:  "+t);
        System.out.println("----------------------------------ACCESSING---------------------------");
        for(String e:t)
        {
            System.out.println(e);
        }
        Iterator<String> t2=t.iterator();
        System.out.println("forward Accessing");
        while(t2.hasNext())
        {
            System.out.println(t2.next());
        }
        System.out.println("------------------------------------REMOVING-------------------------------");
        t.remove("shanmukha");
        System.out.println("shankmukha removed:  "+t);
        t.removeAll(t1);
        System.out.println("t1 elements are removed from t:  "+t);
        // t.retainAll(t1);
        System.out.println("t1 elem enst are retained from t:  "+t);
        // t.clear();
        System.out.println("-------------------------------------SEARCHING_-------------------------");
        System.out.println("find srinivasa:  "+t.contains("srinivasa"));
        System.out.println("find t1 in t:  "+t.containsAll(t1));
        System.out.println("---------------------------------------SORTING-----------------------------");
        System.out.println("t"+t);
        ArrayList<String> a=new ArrayList<>(t);
Collections.sort(a);
System.out.println("after sorting:  "+a);
Collections.reverse(a);
System.out.println("after reversing:  "+a);
    }
}
