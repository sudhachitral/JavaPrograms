import java.util.*;
class StackInteger
{
    public static void main(String args[])
    {
Stack<Integer> s=new Stack<>();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
System.out.println(s);
s.pop();
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.search(20));
Stack<Character> s1=new Stack<>();
s1.push('a');
s1.push('b');
s1.push('c');
s1.push('d');
System.out.println(s1);
System.out.println(s1.pop());
System.out.println(s1.peek());
System.out.println(s1.search('a'));
Stack<String> s2=new Stack<>();
s2.push("nani");
s2.push("nivetha");
s2.push("ram");
s2.push("bhanumathi");
System.out.println(s2);
Stack<String> s3=new Stack<>();
s3.push("mrunal");
s3.push("sam");
s3.push("rashmika");
s3.push("rakul");
s3.push("priyadarshini");
ListIterator<String> str=s2.listIterator(s2.size());
while(str.hasPrevious())
{

    System.out.println("Backwardward"+str.previous());
}
Iterator<String> str1=s2.iterator();
System.out.println("Forward");
while(str1.hasNext())
{
    System.out.println(str1.next());
}
System.out.println("get index"+s2.get(2));

for(String e:s2)
{
    System.out.println(e);
}
System.out.println("-----------------------------SORTING----------------------------------");
Collections.sort(s2);
System.out.println("sorted s2"+s2);
Collections.reverse(s2);
System.out.println("reverse of s2"+s2);
System.out.println("------------------------REMOVAL----------------------------");
s2.remove("rashmiki");
System.out.println("removal of rashmika:   "+s2);
s2.remove(3);
System.out.println("removal of index3:  "+s2);
s2.addAll(s3);
System.out.println("s2 and s3 added in s2:  "+s2);
s2.removeAll(s3);
System.out.println("removed all s3 in s2:   "+s2);
s2.retainAll(s3);
System.out.println("s3 is retained from s2:   "+s2);
s3.clear();
System.out.println("is empty for s3:  "+s3.isEmpty());
    }
}
