package OOPS;
abstract class A{
    public abstract void show();
}
public class abstractanonymous {
    public static void main(String[]args){
        A obj = new A(){
            public void show(){
                System.out.println("Printing From abstract class");
            }
        };
        obj.show();
    }
}
