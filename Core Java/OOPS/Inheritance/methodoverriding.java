package OOPS.Inheritance;
class Animal{
    public void show(){
        System.out.println("Animal Class");
    }
}
class Dog extends Animal{
    public void show(){
        super.show();
        System.out.println("This is a dog class");
    }
}
public class methodoverriding {
    public static void main(String[]args){
        Dog obj = new Dog();
        obj.show();
        Animal obj1 = new Dog();
        obj1.show();

    }
}
