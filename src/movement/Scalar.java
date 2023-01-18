/* Class Scalar.java
 * Represents a named scalar value.
 */

package movement;

public class Scalar
{
	private double value;
	private String name;

	/** Scalar
	 */
	public Scalar()
	{
		this.name = "scalar";
	}

	/** Scalar
	 * @param valuePm double value of the Scalar
	 */
	public Scalar(double valuePm)
	{
		this.value = valuePm;
		this.name = "scalar";
	}

	/** Scalar
	 * @param namePm name of the Scalar
	 */
	public Scalar(String namePm)
	{
		this.name = namePm;
	}

	/** Scalar
	 * @param valuePm double value of the Scalar
	 * @param namePm name of the Scalar
	 */
	public Scalar(double valuePm, String namePm)
	{
		this.value = valuePm;
		this.name = namePm;
	}

	public double value()
	{
		return this.value;
	}

	public void incValue(double inc)
	{
		this.value += inc;
	}

	public void incValue(Scalar incScalar)
	{
		this.value += incScalar.value;
	}

	public void setValue(double newValue)
	{
		this.value = newValue;
	}

	public void setValue(Scalar newScalar)
	{
		this.value = newScalar.value;
	}

	public String name()
	{
		return this.name;
	}

	public void setName(String newName)
	{
		this.name = newName;
	}

	public String toString()
	{
		return String.format("%s: <%.4f>", this.name, this.value);
	}
}
