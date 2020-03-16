import java.util.Scanner;

/**
 * Demonstrates the use of a programmer-defined class.
 * 
 * @author Java Foundations
 */
public class SnakeEyes {
	/**
	 * Creates two Die objects and rolls them several times, counting the number of snake eyes that
	 * occur.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int ROLLS = 500;
		int num1, num2, count = 0;

		// Prompts the user for the number of sides and the seed value for each
		// die.
		System.out.println("How many sides per die? ");
		int maxNumSides = scan.nextInt();
		scan.close();

		Die die1 = new Die(maxNumSides);
		Die die2 = new Die(maxNumSides);

		// Rolls and prints the face value of die1 and die2.
		for (int roll = 1; roll <= ROLLS; roll++) {
			num1 = die1.roll();
			num2 = die2.roll();
			System.out.println("roll " + roll);
			System.out.println("die1 value: " + die1.getFaceValue());
			System.out.println("die2 value: " + die2.getFaceValue());

			System.out.println();

			if (num1 == 1 && num2 == 1) // check for snake eyes
				count++;
		}

		System.out.println("Number of rolls: " + ROLLS);
		System.out.println("Number of snake eyes: " + count);
		System.out.println("Ratio: " + (double) count / ROLLS);
	}

}
