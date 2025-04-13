package Week5_6;

class Bulb {
    private boolean isOn; // Boolean flag to track bulb state

    // Constructor (default off)
    public Bulb() {
        this.isOn = false;
    }

    // Method to turn on the bulb
    public void turnOn() {
        isOn = true;
    }

    // Method to turn off the bulb
    public void turnOff() {
        isOn = false;
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }

    // toString method for displaying bulb status
    @Override
    public String toString() {
        return "Bulb is " + (isOn ? "ON" : "OFF");
    }
}

public class Lights {
    public static void main(String[] args) {
        // Creating Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        // Displaying initial bulb states
        System.out.println("Initial Bulb States:");
        System.out.println("Bulb 1: " + bulb1);
        System.out.println("Bulb 2: " + bulb2);

        // Turning on bulb1
        bulb1.turnOn();
        System.out.println("\nAfter turning on Bulb 1:");
        System.out.println("Bulb 1: " + bulb1);
        System.out.println("Bulb 2: " + bulb2);

        // Turning on bulb2 and turning off bulb1
        bulb2.turnOn();
        bulb1.turnOff();
        System.out.println("\nAfter switching Bulb 1 OFF and Bulb 2 ON:");
        System.out.println("Bulb 1: " + bulb1);
        System.out.println("Bulb 2: " + bulb2);
    }
}

