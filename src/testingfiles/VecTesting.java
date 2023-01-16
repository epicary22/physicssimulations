package testingfiles;

import objects.PhysicsObject;
import movement.Vector2D;

public class VecTesting
{
	public static void main(String[] args)
	{
		Vector2D v = new Vector2D(8, 0);
		System.out.println(v);
		System.out.println(v.getMagnitude());
		System.out.println((v.getRadians() / Math.PI) + "pi");
	}
}
