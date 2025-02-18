import java.io.IOException;

public class Steam {
    public static void main(String[] args){
        System.out.println("A message");
        System.err.println("Error Message");

        try{
            int i = System.in.read();
            System.out.println("You type : "+(char)i);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
