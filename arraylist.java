
//Generic
import java.util.*;
class arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<> ();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(40);
        a1.add(50);
        a1.add(60);
        a.addAll(a1);
        System.out.println(a.addAll(a1));
        System.out.println(a);

        a.add(1,15);
        System.out.println(a);
       System.out.println(a.addAll(2,a1));
       System.out.println(a); 

    }
}