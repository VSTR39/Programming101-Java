package friday;

public class Rectangle {
/*	private final Point upperLeft;
	private final Point rightDown;
	
	public Rectangle(Point pt1,Point pt2){
		if(pt1.getX()==pt2.getX() || pt1.getY()==pt2.getY()){
			System.out.println("Points are on the same axis");
		}
			upperLeft =  new Point(pt1);
			rightDown = new Point(pt2);
	}
	
	public Rectangle(Rectangle r){
		this(r.upperLeft,r.rightDown);
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [" + upperLeft.toString() + "," + rightDown.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rightDown == null) ? 0 : rightDown.hashCode());
		result = prime * result + ((upperLeft == null) ? 0 : upperLeft.hashCode());
		return result;
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
		if (rightDown == null) {
			if (other.rightDown != null)
				return false;
		} else if (!rightDown.equals(other.rightDown))
			return false;
		if (upperLeft == null) {
			if (other.upperLeft != null)
				return false;
		} else if (!upperLeft.equals(other.upperLeft))
			return false;
		return true;
	}
	
	public Point getUpperLeft(){
		return this.upperLeft;
	}
	
	public Point getUpperRight(){
		Point result = new Point(this.rightDown.getX(),this.upperLeft.getY());
		return result;
	}
	
	public Point getLeftDown(){
		Point result = new Point(this.upperLeft.getX(),this.rightDown.getY());
		return result;
	}
	
	public Point getRightDown(){
		return this.rightDown;
	}
	
	public LineSegment getUpperEdge(){
		LineSegment result = new LineSegment(upperLeft,new Point( this.rightDown.getX(),this.upperLeft.getY()));
		return result;
	}
	
	public LineSegment getDownEdge(){
		LineSegment result = new LineSegment(new Point(this.upperLeft.getX(),this.rightDown.getY()),rightDown);
		return result;
	}
	
	public LineSegment getLeftEdge(){
		LineSegment result = new LineSegment(upperLeft, new Point(this.upperLeft.getX(),this.rightDown.getY()));
		return result;
	}
	
	public LineSegment getRightEdge(){
		LineSegment result = new LineSegment(new Point(this.rightDown.getX(),this.upperLeft.getY()),rightDown);
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
}
