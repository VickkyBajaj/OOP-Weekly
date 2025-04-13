package Week5_6;

class Sphere {
    private double diameter;

    // Constructor
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter method for diameter
    public double getDiameter() {
        return diameter;
    }

    // Setter method for diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate and return volume
    public double getVolume() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate and return surface area
    public double getSurfaceArea() {
        double radius = diameter / 2.0;
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // toString method
    @Override
    public String toString() {
        return "Sphere with diameter: " + diameter + 
               ", Volume: " + String.format("%.2f", getVolume()) + 
               ", Surface Area: " + String.format("%.2f", getSurfaceArea());
    }
}

public class MultiSphere {
    public static void main(String[] args) {
        // Creating multiple Sphere objects
        Sphere sphere1 = new Sphere(10);
        Sphere sphere2 = new Sphere(5);
        Sphere sphere3 = new Sphere(12);

        // Displaying initial sphere details
        System.out.println(sphere1);
        System.out.println(sphere2);
        System.out.println(sphere3);

        // Updating sphere2's diameter
        sphere2.setDiameter(8);
        System.out.println("\nAfter updating sphere2's diameter:");
        System.out.println(sphere2);
    }
}
