package creatform;
import java.util.Scanner;

public class CreatForm {
    public static void main(String[] args) {
        Scanner read_key = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = read_key.next();
        System.out.print("Enter your age: ");
        int age = read_key.nextInt();
        System.out.print("Enter your weight: ");
        float weight = read_key.nextFloat();
        System.out.print("Enter yous height: ");
        float height = read_key.nextFloat();
        
        float bmi = weight/(height*height);
        System.out.print("your BMI is: ");
        System.out.println(bmi);
    }    
}
