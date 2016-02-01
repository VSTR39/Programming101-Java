package friday2;

public class Rectangle implements Polygon{
	
	private final Point topLeft;
	private final Point bottomRigth;
	
	public Rectangle(Point tl,Point br){
		topLeft = tl;
		bottomRigth = br;
	}
	
	public Rectangle(Rectangle r){
		this(r.topLeft,r.bottomRigth);
	}
	
	public Point getUpperLeftVertice(){
		return topLeft;
	}
	
	public Point getUpperRightVertice(){
		return new Point(bottomRigth.getX(),topLeft.getY());
	}
	
	public Point getBottomLeftVertice(){
		return new Point(topLeft.getX(),bottomRigth.getY());
	}
	
	public Point getBottomRigthVertice(){
		return bottomRigth;
	}
	
	public LineSegment getLeft(){
		LineSegment result = new LineSegment(topLeft,(new Point(topLeft.getX(),bottomRigth.getY())));
		return result;
	}
	
	public LineSegment getRigth(){
		LineSegment result = new LineSegment((new Point(bottomRigth.getX(),topLeft.getY())),bottomRigth);
		return result;
	}
	
	public LineSegment getTop(){
		LineSegment result = new LineSegment(topLeft,(new Point(bottomRigth.getX(),topLeft.getY())));
		return result;
	}
	
	public LineSegment getBottom(){
		LineSegment result = new LineSegment((new Point(topLeft.getX(),bottomRigth.getY())),bottomRigth);
		return result;
	}
	
	public Point getCenter(){
		double centerX;
		double centerY;
		centerX = (topLeft.getX()-bottomRigth.getX())/2;
		centerY = (topLeft.getY()-bottomRigth.getY())/2;
		Point result = new Point(centerX,centerY);
		return result;
	}
	
	public double getArea(){
		LineSegment x = new LineSegment(topLeft,new Point(topLeft.getX(),bottomRigth.getY()));
		LineSegment y = new LineSegment(topLeft,new Point(bottomRigth.getX(),topLeft.getY()));
		return x.getLength()*y.getLength();
	}
	
	public double getPerimeter(){
		LineSegment x = new LineSegment(topLeft,new Point(topLeft.getX(),bottomRigth.getY()));
		LineSegment y = new LineSegment(topLeft,new Point(bottomRigth.getX(),topLeft.getY()));
		return ((2*x.getLength()) + (2*y.getLength()));
	}
	
	@Override
	public int hashCode() {
	    int hash = 17;
	    hash = hash * 23 + topLeft.hashCode();
	    hash = hash * 23 + bottomRigth.hashCode();
	    return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (bottomRigth == null) {
			if (other.bottomRigth != null)
				return false;
		} else if (!bottomRigth.equals(other.bottomRigth))
			return false;
		if (topLeft == null) {
			if (other.topLeft != null)
				return false;
		} else if (!topLeft.equals(other.topLeft))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Rectangle [topLeft=" + topLeft + ", bottomRigth=" + bottomRigth + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
