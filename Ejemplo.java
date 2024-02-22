public class Ejemplo {
    import java.util.*;
    public static void main(String[] args) {
        Random x =new Random();
        
        String greet = "Hi mom";
        
        int n = x.nextInt(10);

        System.out.println(greet);
        System.out.println(n);
    }
}
