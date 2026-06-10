package OOPS;
class outer{
    class Inner{
        public void show(){
            System.out.println("Printing inside the nested Class");
        }
    }
}
public class NestedClasses {
    public static void main(String[]args){
        outer out = new outer();
        outer.Inner in = out.new Inner();
        in.show();
    }
}
