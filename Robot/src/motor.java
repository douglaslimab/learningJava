package robot;
public class motor {
    public String motor_type;
    public float max_voltage;
    public float speedA;
    public float speedB;
    public int encoder_precision;
    public int wheel_size_mm;
    
    public void status(){
        System.out.println("Motor type: " + this.motor_type);
        System.out.println("Max voltage: " + this.max_voltage);
        System.out.println("Motor speed sensor A: " + this.speedA);
        System.out.println("Motor speed sensor B: " + this.speedB);
        System.out.println("Motor encoder precision: " + this.encoder_precision);
        System.out.println("Motor wheel size: " + this.wheel_size_mm);
    }
    public void motor_init(){
        
    }
    public void set_motor_speed(){
        
    }
    public void break_motor(){
        
    }
    public void set_motor_type(String name){
        System.out.println("Enter the motor type: ");
        this.motor_type = name;        
    }
}
