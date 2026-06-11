package OOPS;

@FunctionalInterface
interface add{
    void addition(int a,int b);
}
@FunctionalInterface
interface multiply{
    int mul(int a,int b);
}
public class lambdaexpressions {
    public static void main(String[]args){
        add obj = (a,b) -> System.out.println(a + b);;
        obj.addition(3 , 4);
        multiply mulobj = (a,b) -> a * b;
        int result = mulobj.mul(23, 12);
        System.out.print(result);
    }
}
