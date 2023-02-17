package raetselsspaces.vectors;

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

	public double dot(Vector2D otherVector)
	{
		return super.dot(otherVector);
	}

	public Vector2D add(Vector2D otherVector)
	{
		return super.add(otherVector);
	}

	public Vector2D multiply(double scalar)
	{
		return super.multiply(scalar);
	}

	public Vector2D direction()
	{
		return super.direction();
	}
}
