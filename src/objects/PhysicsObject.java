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
		this.mass = new Scalar(massPm, "gravity");
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

	public Vector2D position()
	{
		return this.position;
	}

	public Vector2D velocity()
	{
		return this.position;
	}

	public Vector2D acceleration()
	{
		return this.position;
	}

	public double gravity()
	{
		return this.gravity;
	}
	// Scalar values later

	/** not complete */
	public PhysicsObject getFutureObject()
	{
		return new PhysicsObject();
	}
}
