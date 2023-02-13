package raetselsspaces.points;

import java.util.ArrayList;

public class Point3D extends NDimensionalPoint
{
	public Point3D()
	{
		super(3);
	}

	public Point3D(String namePm, ArrayList<Double> valuesPm)
	{
		super(3, namePm, valuesPm);
	}

	public double getX()
	{
		return this.get(0);
	}

	public double getY()
	{
		return this.get(1);
	}

	public double getZ()
	{
		return this.get(2);
	}
}
