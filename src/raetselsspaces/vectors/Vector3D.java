package raetselsspaces.vectors;

import raetselsspaces.points.Point2D;
import raetselsspaces.points.Point3D;
import java.util.Collections;
import java.util.ArrayList;

public class Vector3D extends NDimensionalVector
{
	public static Vector3D I, J, K;
	static
	{
		ArrayList<Double> emptyValues = new ArrayList<>(3);
		for (int i = 0; i < 3; i++)
			emptyValues.add(0.0);
		I = new Vector3D("i^", new Point3D());
		// TODO figure this out.
	}

	public Vector3D(String namePm, Point3D startingPointPm, Point3D endingPointPm)
	{
		super(namePm, startingPointPm, endingPointPm);
	}

	public Vector3D(String namePm, Point3D endingPointPm)
	{
		super(namePm, endingPointPm);
	}

	public Vector3D(NDimensionalVector ndVectorPm)
	{
		super(ndVectorPm.getName(), ndVectorPm.getStartingPoint(), ndVectorPm.getEndingPoint());
	}

	public double dot(Vector3D otherVector)
	{
		return super.dot(otherVector);
	}

	public Vector3D cross(Vector3D otherVector)
	{
		ArrayList<Double> crossValues = new ArrayList<>();
		crossValues.add(this.get(1) * otherVector.get(2) - this.get(2) * otherVector.get(1));
		crossValues.add(this.get(2) * otherVector.get(0) - this.get(0) * otherVector.get(2));
		crossValues.add(this.get(0) * otherVector.get(1) - this.get(1) * otherVector.get(0));
		return new Vector3D("", new Point3D("", crossValues));
	}

	public double angleBetween(Vector3D otherVector)
	{
		return super.angleBetween(otherVector);
	}

	public Vector3D add(Vector3D otherVector)
	{
		return new Vector3D(super.add(otherVector));
	}

	public Vector3D multiply(double scalar)
	{
		return new Vector3D(super.multiply(scalar));
	}

	public Vector3D direction()
	{
		return new Vector3D(super.direction());
	}

	public Point3D getStartingPoint()
	{
		return new Point3D(super.getStartingPoint());
	}

	public Point3D getEndingPoint()
	{
		return new Point3D(super.getEndingPoint());
	}
}
