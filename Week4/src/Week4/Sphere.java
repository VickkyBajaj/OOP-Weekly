package Week4;

import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {

		final double PI = Math.PI;
        Scanner scanner = new Scanner(System.in);

        // Asking for Radius
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Volume and Surface Area
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        double surfaceArea = 4 * PI * Math.pow(radius, 2);

        // Display results to 4 decimal 
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface Area: %.4f\n", surfaceArea);

        scanner.close();
    }
}