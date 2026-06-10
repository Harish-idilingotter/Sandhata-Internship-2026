package OOPS.Inheritance;
class A{
    public A(){
        System.out.println("in A");
    }
    public A(int a){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        this(20);
        System.out.println("in B");
    }
    public B(int a){
        this(10 , 20);
        System.out.println("in B int");
    }
    public B(int a,int b){
        super(10);
        System.out.println("in B two int");
    }
}
public class thisandsuperconstructor {
    public static void main(String[]args){
        B obj = new B(10);
    }
}
