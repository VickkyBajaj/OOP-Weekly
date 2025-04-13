package Week2;
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the distance in miles: ");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.60935;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        scan.close();
    }
}