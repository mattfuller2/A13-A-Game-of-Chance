import java.util.Random;

/**
 * Die.java
 *
 * Represents one die (singular of dice) with faces showing values between 1 and 6.
 *
 * @author Java Foundations
 * @author CS121 Instructors (modified a few things from book)
 * @author Matt Fuller
 */
public class Die {
	public int numSides; // maximum number of sides
	private int faceValue; // current value showing on the die
	private Random rand;

	/**
	 * Constructor: Generates a random number between 1 and the number of sides randomly generated
	 * in the DiceRoller class inclusively.
	 */
	public Die()
		{
			faceValue = 1;
			numSides = 6;
			rand = new Random();
		}

	/**
	 * Overloaded constructor: Sets the number of sides for this die.
	 */
	public Die(int numSides)
		{
			this.numSides = numSides;
			rand = new Random();
			faceValue = rand.nextInt(this.numSides) + 1;
		}

	/**
	 * Computes a new face value for this die and returns the result.
	 * 
	 * @return The new face value.
	 */
	public int roll() {
		// faceValue = (int)(Math.random() * numberOfSides) + 1;
		faceValue = rand.nextInt(numSides) + 1;
		return faceValue;
	}

	/**
	 * Face value mutator. The face value is not modified if the specified value is not valid.
	 *
	 * @param value The new face value. Must be between 1 and max face value.
	 */
	public void setFaceValue(int value) {
		if (value > 0 && value <= numSides) {
			faceValue = value;
		}
	}

	/**
	 * Face value accessor.
	 * 
	 * @return The current face value.
	 */
	public int getFaceValue() {
		return faceValue;
	}

	/**
	 * Returns a string representation of this die.
	 * 
	 * @return faceValue The new face value for this die.
	 */
	@Override
	public String toString() {
		String result = "Die [faceValue = " + faceValue + "]";
		return result;
	}
}
