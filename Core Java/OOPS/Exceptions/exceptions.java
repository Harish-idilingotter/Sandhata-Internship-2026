package OOPS.Exceptions;
class UnderAgeException extends Exception{
    public UnderAgeException(String message){
        super(message);
    }
}
public class exceptions {
    public static void main(String[]args){
        int age = 20;
        try{
            if(age < 18) throw new UnderAgeException("Age should be above 18!!!");
            if(age < 50) throw new Exception("Age should be greater than 50");
        }
        catch(UnderAgeException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("OOPS !!! Something went wrong !!! " + e.getMessage());
        }
    }
}
