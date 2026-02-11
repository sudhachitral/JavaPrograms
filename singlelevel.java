class Parent{
    static int a=10;

    public static void display(){
        System.out.println("parent class method");
    }
}
class Child{
    static int b=20;
    public static void show(){
        System.out.println("child class method");
    }
}
class singlelevel{
    public static void main(String args[]){
        System.out.println("value of a: "+Parent.a);
        Parent.display();

        System.out.println("value of b: "+Child.b);
        Child.show();
    }
}