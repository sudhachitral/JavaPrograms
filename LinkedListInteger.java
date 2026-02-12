// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
 
   
    LinkedList<Integer> l=new java.util.LinkedList<>();
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
    
}
}
