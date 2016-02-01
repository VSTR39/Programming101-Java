package friday;

public class Point{
	private final double x;
	private final double y;
	private final static double origin = 0;
	public Point(){
		x=origin;
		y=origin;
	}
	
	public Point(Point pt){
		this(pt.x,pt.y);
	}
	
	public Point(double coordX,double coordY){
		x=coordX;
		y=coordY;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public String toString(){
		String result = "Point(" + this.x + "," + this.y + ")";
		return result;
	}
	

	public boolean equals(Point p){
		if(this.x==p.getX()&&this.y==p.getY()){
			return true;
		}
		else {
			return false;
		}
	}
	

	
	@Override
	public int hashCode() {
        int hash = 17;
        Double hashX = new Double(x);
        Double hashY = new Double(y);
        hash = hash * 23 + hashX.hashCode();
        hash = hash * 23 + hashY.hashCode();
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
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	public LineSegment add(Point pt1,Point pt2){
		LineSegment result = new LineSegment(pt1,pt2);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
	}

}
