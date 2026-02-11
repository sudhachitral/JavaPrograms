import java.util.*;
class NonGenericArraylist
{
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add("a");
        
        System.out.println(a);
        ArrayList a1=new ArrayList();
        a1.add(40);
        a1.add(true);
        a1.add("b");
        a.addAll(a1);
        System.out.println(a.addAll(a1));
        System.out.println(a);

        a.add(1,15);
        System.out.println(a);
       System.out.println(a.addAll(2,a1));
       System.out.println(a); 

    }
}