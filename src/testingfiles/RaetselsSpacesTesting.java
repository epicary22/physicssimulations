package testingfiles;

import testingfiles.raetselsspaces.vectors.Vector3D;

public class RaetselsSpacesTesting
{
	public static void main(String[] args)
	{
		System.out.println(Vector3D.I.multiply(4).add(Vector3D.J.multiply(5).add(Vector3D.K.multiply(2.54))).rename("myvec").direction());
		System.out.println(new Vector3D("myvec", 4, 5, 2.54).direction());
		// TODO SCALAR PRECISION TEST
	}
}
