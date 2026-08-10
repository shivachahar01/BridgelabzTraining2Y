import java.util.Scanner;

class Kg_to_mile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value in km: ");
        double km = sc.nextDouble();

        double miles = km * 0.621371;

        System.out.println(km + "km is equal to: " + miles + "miles");
        sc.close();
    }
}