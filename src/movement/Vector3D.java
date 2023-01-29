/* Class Vector2D.java
 * Represents a named 2D vector value.
 */

package movement;

public class Vector3D
{
	private final Scalar x, y, z;
	private String name;
	public static final Vector3D I = new Vector3D(1, 0, 0, "i");
	public static final Vector3D J = new Vector3D(0, 1, 0, "j");
	public static final Vector3D K = new Vector3D(0, 0, 1, "k");

	public Vector3D()
	{
		this.x = new Scalar("x");
		this.y = new Scalar("y");
		this.z = new Scalar("z");
		this.name = "vector";
	}

	public Vector3D(double xPm, double yPm, double zPm)
	{
		this.x = new Scalar(xPm, "x");
		this.y = new Scalar(yPm, "y");
		this.z = new Scalar(zPm, "z");
		this.name = "vector";
	}

	public Vector3D(Scalar xPm, Scalar yPm, Scalar zPm)
	{
		this.x = xPm;
		this.y = yPm;
		this.z = zPm;
		this.name = "vector";
	}

	public Vector3D(String namePm)
	{
		this.x = new Scalar("x");
		this.y = new Scalar("y");
		this.z = new Scalar("z");
		this.name = namePm;
	}

	public Vector3D(double xPm, double yPm, double zPm, String namePm)
	{
		this.x = new Scalar(xPm, "x");
		this.y = new Scalar(yPm, "y");
		this.z = new Scalar(zPm, "z");
		this.name = namePm;
	}

	public Vector3D(Scalar xPm, Scalar yPm, Scalar zPm, String namePm)
	{
		this.x = xPm;
		this.y = yPm;
		this.z = zPm;
		this.name = namePm;
	}

	public Vector3D(Vector2D vec2dPm)
	{
		this.x = vec2dPm.getXScalar();
		this.y = vec2dPm.getYScalar();
		this.z = new Scalar("z");
		this.name = vec2dPm.getName();
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

	public double getZ()
	{
		return this.z.value();
	}

	public Scalar getZScalar()
	{
		return this.z;
	}

	public void setZ(double value)
	{
		this.z.setValue(value);
	}

	public void setZ(Scalar newScalar)
	{
		this.z.setValue(newScalar);
	}

	public void incZ(double inc)
	{
		this.z.incValue(inc);
	}

	public void incZ(Scalar incScalar)
	{
		this.z.incValue(incScalar);
	}

	public void setToVector(Vector3D vector)
	{
		this.setX(vector.getX());
		this.setY(vector.getY());
		this.setZ(vector.getZ());
	}

	public void addVector(Vector3D vector)
	{
		this.incX(vector.getX());
		this.incY(vector.getY());
		this.incZ(vector.getZ());
	}

	public void multiply(double multiplier)
	{
		this.setX(this.getX() * multiplier);
		this.setY(this.getY() * multiplier);
		this.setZ(this.getZ() * multiplier);
	}

	public void multiply(Scalar multiplier)
	{
		this.setX(this.getX() * multiplier.value());
		this.setY(this.getY() * multiplier.value());
		this.setZ(this.getZ() * multiplier.value());
	}

	public String getName()
	{
		return this.name;
	}

	public double getMagnitude()
	{
		return Math.sqrt(Math.pow(this.x.value(), 2) + Math.pow(this.y.value(), 2) + Math.pow(this.z.value(), 2));
	}

	public Vector3D getDirection()
	{
		Vector3D direction = new Vector3D(this.x, this.y, this.z);
		direction.multiply(1 / this.getMagnitude());
		return direction;
	}

	//TODO add dot, cross products

	public String toString()
	{
		return String.format("%s: <%s, %s, %s>", this.name, this.x, this.y, this.z);
	}
}
