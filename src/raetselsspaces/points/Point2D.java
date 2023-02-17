package raetselsspaces.points;

import java.util.ArrayList;

public class Point2D extends NDimensionalPoint
{
	public Point2D()
	{
		super(2);
	}

	public Point2D(String namePm, ArrayList<Double> valuesPm)
	{
		super(2, namePm, valuesPm);
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
