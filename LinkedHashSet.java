
import java.util.*;
class LinkedHashSetString{
    public static void main(String args[])
    {
        LinkedHashSet<String> l=new LinkedHashSet<>();
        l.add("Hi Nanna");
        l.add("dasara");
        l.add("paradise");
        l.add("ninnu kori");
        LinkedHashSet<String> l1=new LinkedHashSet<>();
        l1.add("pj");
        l1.add("Kvpg");
        l1.add("gentlemen");
        l1.add("hit3");
        System.out.println("l: "+l);
        System.out.println("l2: "+l1);
        l.addAll(l1);
        System.out.println("l+l1: "+l);
        System.out.println("-----------------------------------ACCESSING--------------------------------");
        for(String e:l)
        {
            System.out.println(e);
        }
        Iterator<String> l2=l.iterator();
        while(l2.hasNext())
        {
            System.out.println(l2.next());
        }
        System.out.println("---------------------------------------------REMOVING-----------------------------");
        l.remove("Kvpg");
        System.out.println("KVPG is removed: "+l);
        l.removeAll(l1);
        System.out.println("l1 all removed from l: "+l);
l.retainAll(l1);
System.out.println("reatined all: "+l);
l1.clear();
System.out.println("-------------------------------------------SEARCHING---------------------------------------");
System.out.println("dasara finds: "+l.contains("dasara"));
System.out.println("l1 in l checking: "+l.containsAll(l1));
System.out.println("----------------------------------------SORTING-----------------------------------------");
 l.add("Hi Nanna");
        l.add("dasara");
        l.add("paradise");
        l.add("ninnu kori");
System.out.println("l: "+l);
ArrayList<String> a=new ArrayList<>(l);
Collections.sort(a);
System.out.println("after sorting: "+a);
Collections.reverse(a);
System.out.println("after reversing: "+a);



    }
}
