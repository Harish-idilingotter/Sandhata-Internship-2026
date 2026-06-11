package OOPS;
class A{
    public void show(){
        System.out.println("Printing from class A");
    }
}
public class anonymousInnerclass {
    public static void main(String[]args){
        A obj = new A()
        {   
            public void show()
            {
                System.out.println("Printing from anonymous Class");
            }
        };
        obj.show();
    }
}
