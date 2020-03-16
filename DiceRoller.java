
import java.util.Random;
import java.util.Scanner;

/**
 * Creates two Die objects, rolls them, and prints their face values.
 * 
 * @author Matt Fuller
 */
public class DiceRoller {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		PairOfDice pair;

		int WINS = 0, LOSES = 0, TIES = 0;
		String rollAgain;

		// Generates random number between 4 and 15 inclusively
		int maxSides = 12;
		int numSides = rand.nextInt(maxSides) + 4;

		// Stores the total value for each roll
		int userRoll, cpuRoll;

		// Plays the game until user does not input "y"
		do {
			pair = new PairOfDice(numSides);
			userRoll = pair.roll();
			System.out.println("Your roll: " + userRoll + " (" + pair.getFaceValue1() + " + " + pair
			        .getFaceValue2() + ")");
			pair = new PairOfDice(numSides);
			cpuRoll = pair.roll();
			System.out.println("Computer's roll: " + cpuRoll + " (" + pair.getFaceValue1() + " + " + pair
			        .getFaceValue2() + ")");

			System.out.println();

			// Updates the score
			if (userRoll == cpuRoll) {
				System.out.println("You tied!");
				TIES += 1;
			} else if (userRoll > cpuRoll) {
				System.out.println("You win!");
				WINS += 1;
			} else {
				System.out.println("You lose!");
				LOSES += 1;
			}

			// Prints the updated score
			System.out.print("Your wins: " + WINS + "\t");
			System.out.print("Computer's wins: " + LOSES + "\t");
			System.out.println("Ties: " + TIES);

			System.out.println();

			// Asks the user if they would like to roll again.
			System.out.println("Do you want to roll again? (Y)es to continue, anything else to quit. ");
			rollAgain = scan.nextLine();
			System.out.println();
			if (rollAgain.equalsIgnoreCase("Y")) {
				rollAgain = "y";
			}
		} while (rollAgain == "y");
		scan.close();
		System.out.println("Thanks for playing!");
	}
}
