import java.util.*;
class GenericAccess
{
    public static void main(String [] args)
    {
        ArrayList<String> a=new ArrayList<>();
        a.add("Rajamatha");
        a.add("bijjala deva");
        a.add("amarendra bahubali");
        a.add("ballaladeva");
        a.add("avantika");
        a.add("devasenaa");
        a.add("kattappa");
        a.add("shivayya");

        System.out.println(a);
        for(String ele:a)
        {
            System.out.println(ele);
        }
        Iterator<String> a1=a.iterator();
        // System.out.println(a1);
        while(a1.hasNext())
        {
            System.out.println(a1.next());
        }
        System.out.println("ListIterator method");
        ListIterator<String> a2=a.listIterator();
            while (a2.hasNext())
            {
                System.out.println(a2.next());
            }
            System.out.println("Forward traversal");
            ListIterator<String> a3= a.listIterator(0);
            while (a3.hasNext())
            {
                System.out.println(a3.next());
            }
            //backward traversal
            System.out.println("Backward Traversal");
            ListIterator<String> a4=a.listIterator(a.size());
            while(a4.hasPrevious()){
                System.out.println(a4.previous());

            }
            //get(int index)
            System.out.println(a.get(2)+" get method");

            
         
    }
}