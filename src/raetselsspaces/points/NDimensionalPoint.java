package raetselsspaces.points;

import java.util.ArrayList;

public class NDimensionalPoint
{
	private int size;
	private ArrayList<Double> values;
	private String name;

	public NDimensionalPoint(int sizePm)
	{
		this.name = "point";
		this.values = new ArrayList<>();
		this.size = sizePm;
		for (int i = 0; i < this.size; i++)
			this.values.add(0.0);
	}

	public NDimensionalPoint(int sizePm, String namePm, ArrayList<Double> valuesPm)
	{
		this.name = namePm;
		this.values = valuesPm;
		this.size = sizePm;
	}

	public int getSize()
	{
		return this.size;
	}

	public double get(int pos)
	{
		if (pos < this.size && pos >= 0)
			return this.values.get(pos);
		return 0.0;
	}
}
