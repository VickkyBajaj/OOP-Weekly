package Week3;

import java.util.Scanner;

public class Reverser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();
        
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" ");
        }

        System.out.println("Reversed sentence: " + result.toString().trim());

        scan.close();
    }
}