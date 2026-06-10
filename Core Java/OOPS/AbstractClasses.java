package OOPS;

abstract class Car{
    public abstract void drive();
    public void play(){
        System.out.println("Playing");
    }
}
class BMW extends Car{
    public void drive(){
        System.out.println("This a BMW car");
    }
}
public class AbstractClasses {
    public static void main(String[]args){
        BMW vehicle = new BMW();
        vehicle.play();
    }
}
