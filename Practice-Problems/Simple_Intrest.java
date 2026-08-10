import java.util.*;
public class Simple_Intrest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter Principal: ");
            int principal = sc.nextInt();

            System.out.print("Enter Rate: ");
            int rate = sc.nextInt();

            System.out.print("Enter Time: ");
            int time = sc.nextInt();

            double SI = (principal * rate * time) / 100;

            System.out.println("Simple Intrest is: " + SI);

            sc.close();

     }
}
