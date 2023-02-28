package raetselsspaces.vectors;

import raetselsspaces.points.NDimensionalPoint;
import java.util.ArrayList;

// TODO add rounding functionality?
// TODO also add some functionality to change either the end or start point.

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
		if (!this.startingPoint.sameDimensions(this.endingPoint))
			throw new ArithmeticException("Points must be of the same dimension!");
		this.size = this.startingPoint.getSize();
		this.generateValuesFromPoints();
	}

	public NDimensionalVector(String namePm, NDimensionalPoint endingPointPm)
	{
		this.name = namePm;
		this.endingPoint = endingPointPm;
		this.startingPoint = new NDimensionalPoint(endingPoint.getSize());
		this.size = this.startingPoint.getSize();
		this.generateValuesFromPoints();
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
			return this.values.get(pos);
		return 0.0;
	}

	double dot(NDimensionalVector otherVector) throws ArithmeticException
	{
		int dotProduct;
		if (this.sameDimensions(otherVector))
		{
			dotProduct = 0;
			for (int i = 0; i < this.size; i++)
				dotProduct += this.get(i) * otherVector.get(i);
			return dotProduct;
		}
		else
			throw new ArithmeticException("Vectors must be of the same dimensions!");
	}

	double angleBetween(NDimensionalVector otherVector)
	{
		return Math.acos(this.dot(otherVector) / (this.magnitude() * otherVector.magnitude()));
	}

	NDimensionalVector add(NDimensionalVector otherVector) throws ArithmeticException
	{
		if (this.sameDimensions(otherVector))
		{
			ArrayList<Double> addedValues = new ArrayList<>();
			for (int i = 0; i < this.size; i++)
				addedValues.add(this.get(i) + otherVector.get(i));
			return new NDimensionalVector("", new NDimensionalPoint(addedValues));
		}
		else
			throw new ArithmeticException("Vectors must be of the same dimensions!");
	}

	NDimensionalVector multiply(double scalar)
	{
		ArrayList<Double> multipliedValues = new ArrayList<>();
		this.values.forEach(v -> multipliedValues.add(v * scalar));
		return new NDimensionalVector("", new NDimensionalPoint(multipliedValues));
	}

	double magnitude()
	{
		double squaresSum = 0;
		for (int i = 0; i < this.size; i++)
			squaresSum += Math.pow(this.get(i), 2);
		return Math.sqrt(squaresSum);
	}
	
	NDimensionalVector direction()
	{
		return new NDimensionalVector(this.name + "^", new NDimensionalPoint(this.multiply(1 / this.magnitude()).getValues()));
	}

	public ArrayList<Double> getValues()
	{
		return this.values;
	}

	NDimensionalPoint getStartingPoint()
	{
		return this.startingPoint;
	}

	NDimensionalPoint getEndingPoint()
	{
		return this.endingPoint;
	}

	public String getName()
	{
		return this.name;
	}

	public NDimensionalVector rename(String newName)
	{
		this.name = newName;
		return this;
	}

	public String toString()
	{
		String rep = this.name + "<";
		for (int i = 0; i < this.size; i++)
		{
			rep += String.format("%.4f, ", this.values.get(i));
		}
		rep += "\b\b>";
		return rep;
	}
}
