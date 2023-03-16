package raetselsspaces.spaces;

import raetselsspaces.points.NDimensionalPoint;
import raetselsspaces.vectors.NDimensionalVector;
import raetselsspaces.scalars.Scalar;

import java.util.HashMap;

public abstract class NDimensionalSpace
{
	private HashMap<String, HashMap<NDimensionalVector>> vectors = new HashMap<>();
	private HashMap<String, HashMap<NDimensionalPoint>> points = new HashMap<>();
	private HashMap<String, HashMap<Scalar> scalars = new HashMap<>();

	public void addPoint(NDimensionalPoint newPoint, String name)
	{
		points.put(name, newPoint);
	}

	public void addVector(NDimensionalVector newVector, String name)
	{
		vectors.put(name, newVector);
	}

	public void addScalar(Scalar newScalar, String name)
	{
		scalars.put(name, newScalar);
	}

	public NDimensionalPoint getPoint(String name)
	{
		return points.get(name);
	}

	public NDimensionalVector getVector(String name)
	{
		return vectors.get(name);
	}

	public Scalar getScalar(String name)
	{
		return scalars.get(name);
	}

	public void displayPoints()
	{
		
	}
}

