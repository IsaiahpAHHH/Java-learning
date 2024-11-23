package java102;
//yes i know this one sucks soo much balls but you gotta understand im literally slow

public class RightT implements Shape{
	public final Point corner;
	public final double sideLength;

	/**
	* @param corner The bottom left corner of the square
	* @param sideLength
	*/
	public RightT(Point corner, double sideLength) {
		this.corner = corner;
		this.sideLength = sideLength;
	}

	public double area() {
		// write this
        return Math.pow(sideLength, 2)/2;
	}
	
	public double perimeter() {
		return Math.pow(Math.pow(sideLength,2)*2, .5)+ sideLength*2;
	}
	
	/** 
	* @return Whether point p is inside of the square.
	*/
	public boolean isInside(Point p) {
		double xDist = p.x - corner.x;
		double yDist = p.y - corner.y;
		return 0 < xDist && xDist < sideLength &&
			   0 < yDist && yDist < sideLength;
               //im too dumb to figure out this one lmao
	}

	/** 
	* @return Whether point p part of/on the border of the square.
	*/
	public boolean isOn(Point p) {
        return Point.distance(corner, p) == sideLength;
        //this too
	}
	
	/** 
	* @param x How much to translate the sqaure by in the + x direction.
	* @param y How much to translate the squarer by in the + y direction.
	* @return The sqaure that results from the translation.
	*/
	public RightT translate(double x, double y) {
        return new RightT(corner.translateX(x).translateY(y), sideLength);
    }
	/** 
	* @return The TRIANGEL that results from scaling the side length and maintaining the bottom left corner
	*/
	public RightT scale(double k) {
		return new RightT(corner, sideLength * k);
	}

	public Point[] corners() {
        Point[] corners = {
            corner,
            corner.translateX(sideLength).translateY(0),
            corner.translateX(0).translateY(sideLength),
        };
        return corners;


	}

	@Override
	public String toString() {
		return "(corner: " + corner + "; side length: " + sideLength + ")";
	}
    
}