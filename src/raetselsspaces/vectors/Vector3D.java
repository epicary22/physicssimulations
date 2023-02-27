package raetselsspaces.vectors;

import raetselsspaces.points.Point3D;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class Vector3D extends NDimensionalVector
{
	public static final Vector3D I = new Vector3D("i^", new Point3D("i^", new ArrayList<Double>(Arrays.asList(1.0, 0.0, 0.0))));
	public static final Vector3D J = new Vector3D("j^", new Point3D("j^", new ArrayList<Double>(Arrays.asList(0.0, 1.0, 0.0))));
	public static final Vector3D K = new Vector3D("k^", new Point3D("k^", new ArrayList<Double>(Arrays.asList(0.0, 0.0, 1.0))));

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
//		ArrayList<Double> crossValues = new ArrayList<>();
//		crossValues.add(this.get(1) * otherVector.get(2) - this.get(2) * otherVector.get(1));
//		crossValues.add(this.get(2) * otherVector.get(0) - this.get(0) * otherVector.get(2));
//		crossValues.add(this.get(0) * otherVector.get(1) - this.get(1) * otherVector.get(0));
//		return new Vector3D("", new Point3D("", crossValues));

		return new Vector3D("", new Point3D("", new ArrayList<Double>(Arrays.asList(
							this.get(1) * otherVector.get(2) - this.get(2) * otherVector.get(1),
							this.get(2) * otherVector.get(0) - this.get(0) * otherVector.get(2),
							this.get(0) * otherVector.get(1) - this.get(1) * otherVector.get(0)
							))));
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
}
