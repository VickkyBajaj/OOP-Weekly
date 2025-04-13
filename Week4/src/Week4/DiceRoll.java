package Week4;

import java.util.Scanner;
import java.util.Random;


public class DiceRoll {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		        
		System.out.print("How many sides does dice 1 have? ");
		int sides1 = scanner.nextInt();
		System.out.print("How many sides does dice 2 have? ");
		
		int sides2 = scanner.nextInt();
		int sum1 = 0, sum2 = 0;
		String j = "";

		// Rolling the dice 3 times
		for (int i = 1; i <= 3; i++) {
			int roll1 = random.nextInt(sides1) + 1;
		    int roll2 = random.nextInt(sides2) + 1;
		    
		    sum1 += roll1;
		    sum2 += roll2;
		    
		    if (i == 1) {
		        j = "first";
		    } else if (i == 2) {
		        j = "second";
		    } else {
		        j = "third";
		    }
		    
		    System.out.println("Dice 1 "+ j + " roll = " + roll1);
		    System.out.println("Dice 2 "+ j +" roll = " + roll2);
		 }

		//Average
		double avg1 = sum1 / 3.0;
		double avg2 = sum2 / 3.0;

		//Results
		System.out.println("Dice 1 rolled a total of " + sum1 + " and rolled " + avg1 + " on average.");
		System.out.println("Dice 2 rolled a total of " + sum2 + " and rolled " + avg2 + " on average.");

		scanner.close();
    }
}