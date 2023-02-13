package raetselsspaces.vectors;

import raetselsspaces.points.NDimensionalPoint;
import java.util.ArrayList;

class NDimensionalVector
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
		if (!this.pointsSameDimensions())
			throw new ArithmeticException("Points must be of the same dimension!");
		this.size = this.startingPoint.getSize();
		this.generateValuesFromPoints();
	}

	private boolean pointsSameDimensions()
	{
		return (this.startingPoint.getSize() == this.endingPoint.getSize());
	}

	private void generateValuesFromPoints()
	{
		this.values = new ArrayList<>();
		for (int i = 0; i < this.size; i++)
		{
			this.values.add(this.endingPoint.get(i) - this.startingPoint.get(i));
		}
	}

	// public NDimensionalVector dot(NDimensionalVector secondVector)
	// {
	// }

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
