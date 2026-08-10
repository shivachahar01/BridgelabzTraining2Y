  import java.util.*;

public class Power_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        double base = sc.nextDouble();

        System.out.println("Enter the exponent value: ");
        double exponent = sc.nextDouble();

        System.out.println(Math.pow(base, exponent));

        sc.close();
    }
}