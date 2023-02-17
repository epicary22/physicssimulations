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
		super(namePm, valuesPm);
	}

	public Point3D(NDimensionalPoint ndPointPm)
	{
		super(ndPointPm.getName(), ndPointPm.getValues());
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
