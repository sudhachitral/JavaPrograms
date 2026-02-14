import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

class Main1
{
    public static void main(String[] args)
    {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(12);
        l.add(20);

        System.out.println(l);
        l.add(10);
    l.add(20);  
    l.add(30);
    l.add(40);
    System.out.println(l);
    LinkedList<Integer> l1=new java.util.LinkedList<>();
    l1.add(10);
    l1.add(20);  
    l1.add(30);
    l1.add(40);
    System.out.println(l1);
    l.addAll(l1);
    System.out.println(l);
    l.add(1,90);
    System.out.println(l);
    l.addAll(3,l1);
    System.out.println(l);
    ListIterator<Integer> lit = l.listIterator();
    while(lit.hasNext())
    {
        System.out.println(lit.next());
    }
    System.out.println("backwards");
     while(lit.hasPrevious())
    {
        System.out.println(lit.previous());
    }
    ListIterator<Integer> l2 = l.listIterator(2);
    System.out.println("from index 2");
    while(l2.hasNext())
    {
        System.out.println(l2.next());
    }
    System.out.println("using for each loop");
    for(Integer i:l)
    {
        System.out.println(i);
    }
    System.out.println("get method"+l.get(1));
    l.remove(10);
    System.out.println("remove 10"+l);
    l.remove(9);
    System.out.println("remove 9"+l);
    l.removeAll(l1);
    System.out.println("remove all elements of l1"+l);
    System.out.println(l.contains(90));
    System.out.println(l.containsAll(l1));
   
    System.out.println(l.indexOf(90));
     System.out.println(l.lastIndexOf(90));
     Collections.sort(l);
        System.out.println("after sorting"+l);
        Collections.reverse(l);
        System.out.println("after reversing"+l);
}
}
