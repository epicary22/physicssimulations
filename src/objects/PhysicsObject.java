package objects;

import movement.Vector2D;
import movement.Scalar;

public class PhysicsObject
{
	private Vector2D position, velocity, acceleration;
	private Scalar gravity, mass;

	public PhysicsObject() {}

	public PhysicsObject(
			Vector2D positionPm,
			Vector2D velocityPm,
			Vector2D accelerationPm,
			double gravityPm,
			double massPm
			)
	{
		this.position = positionPm;
		this.velocity = velocityPm;
		this.acceleration = accelerationPm;
		this.gravity = new Scalar(gravityPm, "gravity");
		this.mass = new Scalar(massPm, "mass");
	}

	public PhysicsObject(
			Vector2D positionPm,
			Vector2D velocityPm,
			Vector2D accelerationPm,
			Scalar gravityPm,
			Scalar massPm
			)
	{
		this.position = positionPm;
		this.velocity = velocityPm;
		this.acceleration = accelerationPm;
		this.gravity = gravityPm;
		this.mass = massPm;
	}

	public Vector2D getPosition()
	{
		return this.position;
	}

	public Vector2D getVelocity()
	{
		return this.position;
	}

	public Vector2D getAcceleration()
	{
		return this.position;
	}

	public double getGravity()
	{
		return this.gravity.value();
	}

	public Scalar getGravityScalar()
	{
		return this.gravity;
	}

	public double getMass()
	{
		return this.mass.value();
	}

	public Scalar getMassScalar()
	{
		return this.mass;
	}

	/** not complete */
	public PhysicsObject getFutureObject()
	{
		return new PhysicsObject();
	}
}
