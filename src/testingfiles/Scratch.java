package testingfiles;

import raetselsspaces.points.Point3D;
import raetselsspaces.vectors.Vector2D;
import raetselsspaces.points.Point2D;
import raetselsspaces.vectors.Vector3D;

import java.util.ArrayList;
import java.util.List;

class Scratch {
	public static void main(String[] args) {
		Point3D p1 = new Point3D("", new ArrayList<>(List.of(3.0, 4.0, 5.0)));
		Point3D p2 = new Point3D("", new ArrayList<>(List.of(5.0, 12.0, 13.0)));

		Vector3D v1 = new Vector3D("v1", p1);
		Vector3D v2 = new Vector3D("v2", p2);

		System.out.println(
				v1 + " " + v2 + "\n"
				+ v1.getStartingPoint() + " " + v1.getEndingPoint() + "\n"
				+ "direction: " + v1.direction() + "\n"
				+ "dot: " + v1.dot(v2) + "\n"
				+ "cross: " + v1.cross(v2) + "\n"
				+ "angle between: " + v1.angleBetween(v2) + "\n"
				+ v1.multiply(3) + "\n"
				+ v1.add(v2)
		);
	}
}