package Threads;
class A extends Thread {
    public void run(){
        for(int i = 0;i < 50;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;i < 50;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class thread {
    public static void main(String[]a){
        A obj = new A();
        B obj2 = new B();
        obj.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.setPriority(10);
        System.out.println(obj.getPriority());
        obj2.start();
    }
}
