import java.util.*;
public class Ejemplo {
    
    public static void main(String[] args) {
        Random x =new Random();
        
        String greet = "Hi mom";
        
        int n = x.nextInt(10);

        System.out.println(greet);
        System.out.println(n);

        persona p1 = new persona("Juan", 29);
    }
}
