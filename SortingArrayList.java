import java.util.*;
class SortingArrayList
{
    public static void main(String args[])
    {
ArrayList<Integer> a=new ArrayList<>(Arrays.asList(3,1,0,9,8,4,30));
Collections.reverse(a);
System.out.println(a);
Collections.sort(a);
System.out.println(a);
Collections.reverse(a);
System.out.println(a);



    }
}
