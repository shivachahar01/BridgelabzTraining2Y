import java.util.*;
public class Sum_of_Two_Num {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of two num is: " + sum);

        sc.close();
    }
    
}
