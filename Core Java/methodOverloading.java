class calculator{
    int num1;
    int num2;
    public int add(int n1 , int n2){
        return n1 + n2;
    }
    public int add(int n1 , int n2 , int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1 , double n2 , double n3){
        return n1 + n2 + n3;
    }
    
}
public class methodOverloading {
    public static void main(String[]args){
        calculator cal = new calculator();
        int result1 = cal.add(2 , 3);
        int result2 = cal.add(2 , 3 , 5);
        double result3 = cal.add(2.0 , 3.0 , 6.0);
        System.out.print(result1 + " " + result2 + " " + result3);
    }
}
