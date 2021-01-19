package robot;
import java.util.Scanner;
public class Robot {
    public static void main(String[] args) {
        motor m1 = new motor();
        System.out.println("""
                           -----------------------------------------
                           Peripherals in our robot up till now..
                           -----------------------------------------
                           -Motor
                           -----------------------------------------
                           """);
        System.out.println("Enter the type of motor: ");
        m1.set_motor_type("DC");
        m1.status();
    }
}
