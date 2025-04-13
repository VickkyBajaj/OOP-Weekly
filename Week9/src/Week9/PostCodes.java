package Week9;

import java.util.Scanner;

public class PostCodes {

    // Static inner class to represent a post entry
    static class PostEntry {
        private String firstName;
        private String lastName;
        private String postalCode;

        public PostEntry(String firstName, String lastName, String postalCode) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.postalCode = postalCode;
        }

        public void display() {
            System.out.printf("Name: %s %s\tPost Code: %s%n", firstName, lastName, postalCode);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PostEntry[] entries = new PostEntry[25];
        int count = 0;

        System.out.println("Enter up to 25 entries (FirstName LastName PostCode).");
        System.out.println("Use tab as separator. Type 'done' to stop:");

        while (scanner.hasNextLine() && count < 25) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("done")) break;

            String[] parts = line.trim().split("\\t"); // Only tab-separated accepts tab, comma, or space
            if (parts.length == 3) {
                entries[count] = new PostEntry(parts[0], parts[1], parts[2]);
                count++;
            } else {
                System.out.println("Invalid input format. Use: FirstName LastName PostCode (Use tab as separator)");
            }
        }

        System.out.println("\nCollected Entries:");
        for (int i = 0; i < count; i++) {
            entries[i].display();
        }

        scanner.close();
    }
}
