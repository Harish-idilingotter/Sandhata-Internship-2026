package OOPS.Inheritance.Calculators;

public class AdvancedCalculator extends calculator {
    public int square(int a){
        return multiply(a , a);
    }
    public int cube(int a){
        return(multiply(square(a), a));
    }
}
