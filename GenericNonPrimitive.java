import java.util.ArrayList;

class GenericNonPrimitive{
    public static void main(String [] args){
        {
          ArrayList<String> a=new ArrayList<> ();
        a.add("hi");
        a.add("hello");
        
        System.out.println(a);
        ArrayList<String> a1=new ArrayList<>();
        a1.add("world");
        a1.add("Tom");
        
        a.addAll(a1);
        System.out.println(a.addAll(a1));
        System.out.println(a);

        a.add(1,"Jack");
        System.out.println(a);
       System.out.println(a.addAll(2,a1));
       System.out.println(a); 

    }
}
        }
   