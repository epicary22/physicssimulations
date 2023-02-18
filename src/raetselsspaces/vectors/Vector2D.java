package raetselsspaces.vectors;

import raetselsspaces.points.Point2D;

public class Vector2D extends NDimensionalVector
{
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

	public Point2D getStartingPoint()
	{
		return new Point2D(super.getStartingPoint());
	}

	public Point2D getEndingPoint()
	{
		return new Point2D(super.getEndingPoint());
	}
}
