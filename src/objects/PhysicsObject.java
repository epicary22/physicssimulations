package objects;

import movement.Vector2D;

public class PhysicsObject
{
	private Vector2D position, velocity, acceleration;

	public PhysicsObject() {}

	public PhysicsObject(Vector2D positionPm, Vector2D velocityPm, Vector2D accelerationPm)
	{
		this.position = positionPm;
		this.velocity = velocityPm;
		this.acceleration = accelerationPm;
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
}
