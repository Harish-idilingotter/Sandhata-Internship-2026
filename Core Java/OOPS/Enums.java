package OOPS;

enum status{
    Running , Failed , Pending , Success;
}
enum Laptops{
    Mackbook(2000) , surface(1000) , XPS(2200) , ThinkPad(800);
    private int price;
    Laptops(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class Enums {
    public static void main(String[]args){
        status ss[] = status.values();
        for(status s : ss) System.out.println(s + " : " + s.ordinal());

        status s = status.Running;
        switch(s)
        {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Error");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
        }

        for(Laptops lap : Laptops.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
            
        }
    }
}
