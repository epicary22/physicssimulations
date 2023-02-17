package raetselsspaces.vectors;

public class Vector3D extends NDimensionalVector
{
	public Vector3D(String namePm, Point3D startingPointPm, Point3D endingPointPm)
	{
		super(namePm, startingPointPm, endingPointPm);
	}

	public Vector3D(String namePm, Point3D endingPointPm)
	{
		super(namePm, endingPointPm);
	}

	public double dot(Vector3D otherVector)
	{
		return super.dot(otherVector);
	}

	public Vector3D add(Vector3D otherVector)
	{
		return super.dot(otherVector);
	}

	public Vector3D multiply(double scalar)
	{
		return super.multiply(scalar);
	}

	public Vector3D direction()
	{
		return super.direction();
	}

	public Vector3D cross(Vector3D otherVector)
	{
		// TODO implement cross product
	}
}
