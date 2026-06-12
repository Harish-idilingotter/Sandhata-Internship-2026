package Threads;

public class RunnableObjects {
    public static void main(String[]args){
        Runnable obj1 = () -> {
            for(int i = 0;i <= 5;i++){
                System.out.println("Hi");
                try{
                    Thread.sleep(5);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for(int i = 0;i <= 5;i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(5);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try{
            Thread.sleep(5);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
    }
}
