package java102;

public class Point {
	public final double x;
	public final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point translateX(double t) {
		return new Point(x + t, y);
	}

	public Point translateY(double t) {
		return new Point(x, y + t);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

	public static Point centerOfMass(Point[] points) {
		int lengthh = points.length;
		double xsum = 0;
		double ysum = 0;
		double xs[] = new double[lengthh];
		double ys[] = new double[lengthh];
		for(int examples = 0; examples < lengthh; examples++){
			xs[examples] = points[examples].x;
			ys[examples] = points[examples].y;
		}
		for(int addingUp = 0; addingUp < lengthh; addingUp++) {
			xsum += xs[addingUp];
			ysum += ys[addingUp];
		}
		return new Point(xsum/lengthh, ysum/lengthh);		
	}
	//im actually really proud of this one i did it without ai lmao
	//this one i did not do without ai
	public double angle() {
		double angleInRadians = Math.atan2(y,x);
		return Math.toDegrees(angleInRadians);
	}
}

