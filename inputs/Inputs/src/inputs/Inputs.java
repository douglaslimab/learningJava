package inputs;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the first scores: ");
        float n1 = keyboard.nextFloat();
        System.out.println("Enter the second scores: ");
        float n2 = keyboard.nextFloat();
        
        float result = (n1 + n2)/2;
        System.out.println(result);
    }    
}
