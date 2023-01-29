package testingfiles;

import movement.Vector3D;
import objects.PhysicsObject;
import movement.Vector2D;
import movement.Scalar;

public class VecTesting
{
	public static void main(String[] args)
	{
		System.out.printf("%s %s %s %s%n", new Scalar(), new Scalar(8), new Scalar("hello!"), new Scalar(8, "spd"));
		Vector2D v = new Vector2D(8, 0);
		System.out.printf("%s %.4f %.4fpi%n", v, v.getMagnitude(), (v.getRadians() / Math.PI));
		Vector3D v3 = new Vector3D(8, 7.8, -64, ":)");
		System.out.println(v3);
		System.out.println(v3.getDirection());
	}
}
