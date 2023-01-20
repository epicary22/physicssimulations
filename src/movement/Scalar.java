/* Class Scalar.java
 * Represents a named scalar value.
 */

package movement;

/**
 * A named scalar with a double value.
 */
public class Scalar
{
	private double value;
	private String name;

	/**
	 * Creates a new Scalar with a value of 0 and a name of "scalar".
	 */
	public Scalar()
	{
		this.name = "scalar";
	}

	/**
	 * Creates a new Scalar with a given value and a name of "scalar".
	 * @param valuePm double value of the Scalar
	 */
	public Scalar(double valuePm)
	{
		this.value = valuePm;
		this.name = "scalar";
	}

	/**
	 * Creates a new Scalar with a value of 0 and a given name.
	 * @param namePm name of the Scalar
	 */
	public Scalar(String namePm)
	{
		this.name = namePm;
	}

	/**
	 * Creates a new Scalar with a given value and a given name.
	 * @param valuePm double value of the Scalar
	 * @param namePm name of the Scalar
	 */
	public Scalar(double valuePm, String namePm)
	{
		this.value = valuePm;
		this.name = namePm;
	}

	/**
	 * Accessor method for the Scalar's value.
	 * @return the double value of the Scalar.
	 */
	public double value()
	{
		return this.value;
	}

	/**
	 * Increments the value of the Scalar by a given double value.
	 * @param inc the amount to increment the Scalar's value.
	 */
	public void incValue(double inc)
	{
		this.value += inc;
	}

	/**
	 * Increments the value of the Scalar by a given Scalar value.
	 * @param incScalar the Scalar to increase this Scalar by.
	 */
	public void incValue(Scalar incScalar)
	{
		this.value += incScalar.value;
	}

	/**
	 * Sets the value of the Scalar to a new double value.
	 * @param newValue the new double value for the Scalar.
	 */
	public void setValue(double newValue)
	{
		this.value = newValue;
	}

	/**
	 * Sets the value of the Scalar to a new Scalar value.
	 * @param newScalar the new Scalar value for the Scalar.
	 */
	public void setValue(Scalar newScalar)
	{
		this.value = newScalar.value;
	}

	/**
	 * Gets the name of the Scalar.
	 * @return the name of the Scalar.
	 */
	public String name()
	{
		return this.name;
	}

	/**
	 * Sets the name of the Scalar.
	 * @param newName the new name for this Scalar.
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}

	/**
	 * Turns the scalar into a String with the format: <name: value>
	 * @return the formatted String value.
	 */
	@Override
	public String toString()
	{
		return String.format("%s: <%.4f>", this.name, this.value);
	}
}
