package pen;
public class Pen {
    public static void main(String[] args) {
        Pen_class pen1 = new Pen_class();
        pen1.color = "Blue";
        pen1.tip = 0.5f;
        pen1.closed = false;
                
        pen1.status();
        pen1.open();
        pen1.write();
        pen1.close();
        
        Pen_class pen2 = new Pen_class();
        pen2.color = "Red";
        pen2.model = "Bic";
        pen2.close();
        
        pen2.status();
        pen2.open();
        pen2.write();
        pen2.close();
    }
    
}
