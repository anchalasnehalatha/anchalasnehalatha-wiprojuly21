package Day12wrapperclasses;

public class program1 {
    public static void main(String[] args) {

      
        Integer a = 1;
        System.out.println("Boxed value: " + a);

       
        Integer b = Integer.valueOf(5);

      
        int i = b.intValue(); 
        int j = b; // auto-unboxing

        System.out.println("Explicit unboxing: " + i);
        System.out.println("Auto-unboxing: " + j);
    }
}
