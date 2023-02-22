package raetselsspaces.vectors;

import raetselsspaces.points.Point2D;
import java.util.Arrays;
import java.util.ArrayList;

public class Vector2D extends NDimensionalVector
{
	static Vector2D I, J;
	static {
		I = new Vector2D("i^", new Point2D("i^", new ArrayList<Double>(Arrays.asList(1.0, 0.0))));
		J = new Vector2D("j^", new Point2D("j^", new ArrayList<Double>(Arrays.asList(0.0, 1.0))));
	}

	public Vector2D(String namePm, Point2D startingPointPm, Point2D endingPointPm)
	{
		super(namePm, startingPointPm, endingPointPm);
	}

	public Vector2D(String namePm, Point2D endingPointPm)
	{
		super(namePm, endingPointPm);
	}

	public Vector2D(NDimensionalVector ndVectorPm)
	{
		super(ndVectorPm.getName(), ndVectorPm.getStartingPoint(), ndVectorPm.getEndingPoint());
	}

	public double dot(Vector2D otherVector)
	{
		return super.dot(otherVector);
	}

	public double angleBetween(Vector2D otherVector)
	{
		return super.angleBetween(otherVector);
	}

	public Vector2D add(Vector2D otherVector)
	{
		return new Vector2D(super.add(otherVector));
	}

	public Vector2D multiply(double scalar)
	{
		return new Vector2D(super.multiply(scalar));
	}

	public Vector2D direction()
	{
		return new Vector2D(super.direction());
	}
}
