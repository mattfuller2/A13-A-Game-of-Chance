/**
 * Manages a pair of Die objects so we don't have to keep track of 2 dice in our DiceRoller class.
 * 
 * @author Matt Fuller
 *
 */
public class PairOfDice {
	private int faceValue1; // Number showing on the first die.
	private int faceValue2; // Number showing on the second die.
	private Die die1;
	private Die die2;

	/**
	 * Constructor: Creates two Die objects with the default number of sides.
	 */
	public PairOfDice()
		{
			die1 = new Die();
			faceValue1 = die1.getFaceValue();
			die2 = new Die();
			faceValue2 = die1.getFaceValue();
		}

	/**
	 * Overload constructor: Accepts an integer specifying the MAX face value.
	 */
	public PairOfDice(int numSides)
		{
			die1 = new Die(numSides);
			faceValue1 = die1.getFaceValue();
			die2 = new Die(numSides);
			faceValue2 = die2.getFaceValue();
		}

	/**
	 * Rolls both Die objects and returns the sum of their face values.
	 * 
	 * @return The sum of their face values.
	 */
	public int roll() {
		faceValue1 = die1.roll();
		faceValue2 = die2.roll();
		return getTotal();
	}

	/**
	 * Face value mutator. The face value is not modified if the specified value is not valid.
	 *
	 * @return faceValue The current face value of the first die only. Must be between 1 and max
	 *         face value.
	 */
	public int getFaceValue1() {
		return faceValue1;
	}

	/**
	 * Face value mutator. The face value is not modified if the specified value is not valid.
	 *
	 * @return faceValue The current face value of the second die only. Must be between 1 and max
	 *         face value.
	 */
	public int getFaceValue2() {
		return faceValue2;
	}

	/**
	 * Total face value sum mutator. The face value is not modified if the specified value is not
	 * valid.
	 *
	 * @return sum The sum of the current face values for both dice.
	 */
	public int getTotal() {
		return getFaceValue1() + getFaceValue2();
	}

	/**
	 * Returns a string representation of the PairOfDice.
	 * 
	 * @return sum (faceValue1 + faceValue2)
	 */
	@Override
	public String toString() {
		String result = (getTotal() + " (" + getFaceValue1() + " + " + getFaceValue1() + ")");
		return result;
	}
}
