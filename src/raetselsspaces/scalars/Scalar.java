package raetselsspaces.scalars;

class Scalar
{
	private double value;
	private String name;

	public Scalar(double valuePm, String namePm)
	{
		this.value = valuePm;
		this.name = namePm;
	}

	public double getValue()
	{
		return this.value;
	}

	public String getName()
	{
		return this.name;
	}

	public String toString()
	{
		return String.format("%s<%.2f>", this.name, this.value);
	}
}
