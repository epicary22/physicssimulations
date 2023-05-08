package raetselsspaces.vectors;

import raetselsspaces.points.Point2D;
import java.util.Arrays;
import java.util.ArrayList;

public class Vector2D extends NDimensionalVector
{
	public static final Vector2D I = new Vector2D("i^", new Point2D("", new ArrayList<>(Arrays.asList(1.0, 0.0))));
	public static final Vector2D J = new Vector2D("j^", new Point2D("", new ArrayList<>(Arrays.asList(0.0, 1.0))));

	public Vector2D(String namePm, Point2D startingPointPm, Point2D endingPointPm)
	{
		super(namePm, startingPointPm, endingPointPm);
	}

	public Vector2D(String namePm, Point2D endingPointPm)
	{
		super(namePm, endingPointPm);
	}

	public Vector2D(String namePm, double endX, double endY)
	{
		super(namePm, new Point2D("", endX, endY)
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

	public Point2D getEndingPoint() {
		return new Point2D(super.getEndingPoint());
	}

	public Vector2D rename(String newName)
	{
		return new Vector2D(super.rename(newName));
	}
}
