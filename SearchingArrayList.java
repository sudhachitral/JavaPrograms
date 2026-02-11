import java.util.ArrayList;
class SearchingArrayList
{
 public static void main(String args[])
 {
    ArrayList<String> a= new ArrayList<>();
    a.add("will");
    a.add("Mike");
    a.add("eleven");
    a.add("lukas");
    ArrayList<String> b=new ArrayList<>();
    b.add("mike");
    b.add("max");
    b.add("eleven");
    b.add("holly");
    ArrayList<String> c=new ArrayList<>();
    c.add("will");
    c.add("Mike");
    c.add("lukas");
    System.out.println(a.contains("Mike"));
    System.out.println(a.contains("jack"));
    System.out.println(a.containsAll(b));
    System.out.println(a.containsAll(c));
    System.out.println(a.indexOf("Mike")+" "+a.indexOf("rose"));
    a.add("Mike");
    System.out.println(a.lastIndexOf("Mike"));



 }   
}