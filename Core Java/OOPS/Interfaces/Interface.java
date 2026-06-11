package OOPS.Interfaces;
import java.util.Scanner;
interface computer{
    void code();
}

interface server{
    void start();
}
class laptop implements computer , server{
    public void code(){
        System.out.println("Printing from Laptop");
    }
    public void start(){
        System.out.println("Starting Server on laptop");
    }
}

class desktop implements computer , server {
    public void code(){
        System.out.println("Printing from desktop");
    }
    public void start(){
        System.out.println("Starting server on desktop");
    }
}

public class Interface {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        computer system;
        server ser;
        if(n == 1)
        {
            system = new laptop();
            system.code();
            ser = new laptop();
            ser.start();
        } 
        else
        {
            system = new desktop();
            system.code();
            ser = new desktop();
            ser.start();
        }
        scan.close();
    }
}
