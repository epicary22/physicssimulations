package raetselsspaces.vectors;

import raetselsspaces.points.NDimensionalPoint;
import java.util.ArrayList;

public class NDimensionalVector
{
	private NDimensionalPoint startingPoint, endingPoint;
	private ArrayList<Double> values;
	private String name;
	private int size;

	public NDimensionalVector(String namePm, NDimensionalPoint startingPointPm, NDimensionalPoint endingPointPm) throws ArithmeticException
	{
		this.name = namePm;
		this.startingPoint = startingPointPm;
		this.endingPoint = endingPointPm;
		if (this.startingPoint.sameDimensions(this.endingPoint))
			throw new ArithmeticException("Points must be of the same dimension!");
		this.generateValuesFromPoints();
		this.size = this.startingPoint.getSize();
	}

	public NDimensionalVector(String namePm, NDimensionalPoint endingPointPm)
	{
		this.name = namePm;
		this.endingPoint = endingPointPm;
		this.startingPoint = new NDimensionalPoint(endingPoint.getSize());
		this.generateValuesFromPoints();
		this.size = this.startingPoint.getSize();
	}

	public boolean sameDimensions(NDimensionalVector secondVector)
	{
		return (this.size == secondVector.size);
	}

	private void generateValuesFromPoints()
	{
		this.values = new ArrayList<>();
		for (int i = 0; i < this.size; i++)
		{
			this.values.add(this.endingPoint.get(i) - this.startingPoint.get(i));
		}
	}

	public double get(int pos)
	{
		if (pos < this.size && pos >= 0)
			return this.values.get(index);
		return 0.0;
	}

	public double dot(NDimensionalVector secondVector) throws ArithmeticException
	{
		int dotProduct;
		if (this.sameDimensions(otherVector))
		{
			dotProduct = 0;
			for (int i = 0; i < this.size; i++)
				dotProduct += this.get(i) * secondVector.get(i);
			return dotProduct;
		}
		else
			throw new ArithmeticException("Vectors must be of the same dimensions!");
	}

	public NDimensionalVector add(NDimensionalVector otherVector) throws ArithmeticException
	{
		if (this.sameDimensions(otherVector))
		{
			ArrayList<Double> addedValues = new ArrayList<>();
			for (int i = 0; i < this.size; i++)
				addedValues.add(this.get(i) + otherVector.get(i));
			return new NDimensionalVector(this.name, new NDimensionalPoint(addedValues));
		}
		else
			throw new ArithmeticException("Vectors must be of the same dimensions!");
	}

	public NDimensionalVector multiply(double scalar)
	{
		ArrayList<Double> multipliedValues = new ArrayList<>();
		this.values.forEach(v -> multipliedValues.add(v * scalar));
		return new NDimensionalVector("", new NDimensionalPoint(multipliedValues));
	}

	public double magnitude()
	{
		int squaresSum;
		for (int i = 0; i < this.size; i++)
			squaresSum += Math.pow(this.get(i), 2);
		return Math.sqrt(squaresSum);
	}
	
	public NDimensionalVector direction()
	{
		NDimensionalVector directionVector = new NDimensionalVector(this.name + "^", this.multiply(this.magnitude()).getValues());
	}

	public ArrayList<Double> getValues()
	{
		return this.values;
	}

	public double getName()
	{
		return this.name;
	}

	public void rename(String newName)
	{
		this.name = newName;
	}

	public String toString()
	{
		String rep = this.name + "<";
		for (int i = 0; i < this.size; i++)
		{
			rep += this.values.get(i) + ", ";
		}
		rep += "\b\b>";
		return rep;
	}
}
