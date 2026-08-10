import java.util.Scanner;

public class Average_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double average = (a + b + c) / 3;

        System.out.println("Average of three num is: " +average);
    sc.close();
    }
}