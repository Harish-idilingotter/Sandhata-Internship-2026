package OOPS.Inheritance;
import OOPS.Inheritance.Calculators.calculator;
import OOPS.Inheritance.Calculators.AdvancedCalculator;
public class calculatorDemo {
    public static void main(String[]args){
        int a = 10;
        int b = 30;
        calculator basecal = new calculator();
        AdvancedCalculator advcal = new AdvancedCalculator();
        int addition = basecal.add(a , b);
        int subtraction = basecal.subtract(a , b);
        int mul = basecal.multiply(a , b);
        int div = basecal.divide(a , b);
        System.out.println("Base Calculator");
        System.out.println(addition + " " + subtraction + " " + mul + " " + div);
        int square = advcal.square(a);
        int cube = advcal.cube(a);
        System.out.println("Advanced Calculator");
        System.out.println(square + " " + cube);
    }
}
