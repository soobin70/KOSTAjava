package ex9;

class Point3D {
	int x, y, z;

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Point3D() {
		this(0, 0, 0);
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Point3D))return false;
		Point3D p3d =(Point3D)obj;
		return x==p3d.x && y==p3d.y && z==p3d.z;
	}

	public String toString() {
		return String.format("[%d,%d,%d]", x,y,z);
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1 == p2));
		System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
	}

}
