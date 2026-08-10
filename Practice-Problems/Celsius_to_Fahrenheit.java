import java.util.*;
public class Celsius_to_Fahrenheit {
    public static void main(String [] main){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temp in Celsius: ");
        float Celsius = sc.nextFloat();

        float Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println(Celsius + "C is equal to: " + Fahrenheit + "F");

        sc.close();
    }
    
}
