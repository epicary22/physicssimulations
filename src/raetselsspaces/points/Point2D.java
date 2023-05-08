package raetselsspaces.points;

import java.util.ArrayList;
import java.util.Arrays;

public class Point2D extends NDimensionalPoint
{
	public Point2D()
	{
		super(2);
	}

	public Point2D(String namePm, ArrayList<Double> valuesPm)
	{
		super(namePm, valuesPm);
	}

	public Point2D(String namePm, double xPm, double yPm)
	{
		super(namePm, new ArrayList<>(Arrays.asList(xPm, yPm)));
	}

	public Point2D(NDimensionalPoint ndPointPm)
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
}
