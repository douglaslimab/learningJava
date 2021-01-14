package pen;
public class Pen_class {
    String model;
    String color;
    float tip;
    int load;
    boolean closed;
    
    void status(){
        System.out.println("Model: " + this.model);
        System.out.println("One Pen " + this.color);
        System.out.println("Tip: " + this.tip);
        System.out.println("Load: " + this.load);
        System.out.println("Is this pen closed? " + this.closed);
    }
    
    void write(){
        if(this.closed == true){
            System.out.println("Wrong, the lid is closed.");
        } else{
            System.out.println("Ready.");
        }
    }
    
    void close(){
        this.closed = true;
    }
    
    void open(){
        this.closed = false;
    }
}
