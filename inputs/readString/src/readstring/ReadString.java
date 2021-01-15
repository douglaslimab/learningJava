package readstring;
import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Enter your name.");
        String name = key.next();
        System.out.print("Thank you, ");
        System.out.println(name);
    }    
}
