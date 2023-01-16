package movement;

public class Vector2D
{
	public double x, y;

	public Vector2D() {}

	public Vector2D(double xPm, double yPm)
	{
		this.x = xPm;
		this.y = yPm;
	}

	public double getX()
	{
		return this.x;
	}

	public void setX(double value)
	{
		this.x = value;
	}

	public void incX(double inc)
	{
		this.x += inc;
	}

	public double getY()
	{
		return this.y;
	}

	public void setY(double value)
	{
		this.y = value;
	}

	public void incY(double inc)
	{
		this.y += inc;
	}

	public void setToVector(Vector2D vector)
	{
		this.setX(vector.getX());
		this.setY(vector.getY());
	}

	public void addVector(Vector2D vector)
	{
		this.incX(vector.getX());
		this.incY(vector.getY());
	}

	public double getMagnitude()
	{
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

	public double getRadians()
	{
		double radians;

		radians = Math.atan(this.y / this.x);
		if (this.x < 0)  // Scans Q2, Q3
			radians += Math.PI;
		else if (this.y < 0)  // Scans Q4
			radians += 2 * Math.PI;
		return radians;
	}

	public String toString()
	{
		return String.format("<%.4f, %.4f>", this.x, this.y);
	}
}
