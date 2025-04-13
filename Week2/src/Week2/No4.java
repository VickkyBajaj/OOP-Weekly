package Week2;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the square's side: ");
        int side = scan.nextInt();
        int perimeter = 4 * side;
        int area = side * side;
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);
        scan.close();
    }
}