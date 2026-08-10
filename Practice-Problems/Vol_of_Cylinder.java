import java.util.*;
public class Vol_of_Cylinder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float radius = sc.nextFloat();

        System.out.print("Enter the heighht: ");
        float height = sc.nextFloat();

        double volume = 3.14 * radius * radius * height;

        System.out.println("Volume of Cylinder is: " + volume);

        sc.close();


    }
    
}
