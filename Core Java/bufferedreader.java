import java.io.*;
public class bufferedreader {
    public static void main(String[]args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        try{
        int num = Integer.parseInt(bf.readLine());
        System.out.print(num);
        }  
        catch(NumberFormatException e){
            System.out.println("Please Enter an Integer !!!!");
        } 
        catch(IOException e){
            System.out.println(e.getMessage());
        }  
        finally{
            bf.close();
        }  
    }
}
