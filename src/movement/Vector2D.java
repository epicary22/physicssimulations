/* Class Vector2D.java
 * Represents a named 2D vector value.
 */

package movement;

public class Vector2D
{
	public Scalar x, y;

	public Vector2D()
	{
		this.x = new Scalar("x");
		this.y = new Scalar("y");
	}

	public Vector2D(double xPm, double yPm)
	{
		this.x = new Scalar(xPm, "x");
		this.y = new Scalar(yPm, "y");
	}

	public Vector2D(Scalar xPm, Scalar yPm)
	{
		this.x = xPm;
		this.y = yPm;
	}

	public double getX()
	{
		return this.x.value();
	}

	public Scalar getXScalar()
	{
		return this.x;
	}

	public void setX(double value)
	{
		this.x.setValue(value);
	}

	public void setX(Scalar newScalar)
	{
		this.x.setValue(newScalar);
	}

	public void incX(double inc)
	{
		this.x.incValue(inc);
	}

	public void incX(Scalar incScalar)
	{
		this.x.incValue(incScalar);
	}

	public double getY()
	{
		return this.y.value();
	}

	public Scalar getYScalar()
	{
		return this.y;
	}

	public void setY(double value)
	{
		this.y.setValue(value);
	}

	public void setY(Scalar newScalar)
	{
		this.y.setValue(newScalar);
	}

	public void incY(double inc)
	{
		this.y.incValue(inc);
	}

	public void incY(Scalar incScalar)
	{
		this.y.incValue(incScalar);
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
		return Math.sqrt(Math.pow(this.x.value(), 2) + Math.pow(this.y.value(), 2));
	}

	public double getRadians()
	{
		double radians;
		double xDbl, yDbl;

		xDbl = this.x.value();
		yDbl = this.y.value();

		radians = Math.atan(yDbl / xDbl);
		if (xDbl < 0)  // Scans Q2, Q3
			radians += Math.PI;
		else if (yDbl < 0)  // Scans Q4
			radians += 2 * Math.PI;
		return radians;
	}

	public String toString()
	{
		return String.format("<%s, %s>", this.x, this.y);
	}
}
