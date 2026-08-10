import java.util.*;
public class Perimeter_of_Rect {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        float length = sc.nextFloat();

        System.out.print("Enter the width: ");
        float width = sc.nextFloat();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter of Rectangle is: " + perimeter);

        sc.close();
        
    }
    
}
