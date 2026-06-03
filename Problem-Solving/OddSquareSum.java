import java.util.*;
public class OddSquareSum{

    public static long forloop(long n){
        long sum = 0;
        for(long i = 1;i <= n;i+=2){
            sum += (i * i);
        }
        return sum;
    }
    public static void main(String[]args){
        long n = 559000 / 2;
        long sum = (n * (2*n - 1) * (2*n + 1)) / 3;
        System.out.println(sum);
        System.out.println(forloop(559000));
    }
}