import java.util.*;
public class Area_of_Circle {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float radius = sc.nextFloat();

        double area = 3.14 * radius * radius;

        System.out.println("Area of circle is: " + area);

        sc.close();
    }
    
}
