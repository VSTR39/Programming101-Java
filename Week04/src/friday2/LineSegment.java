package friday2;

import friday2.LineSegment;
import friday2.Point;

public class LineSegment {
	private final  Point first;
	private final Point second;
	
	public LineSegment(Point pt1,Point pt2){
		 first = new Point(pt1);
		 second = new Point(pt2);
	}
	
	
	public LineSegment(LineSegment sgm){
		this(sgm.first,sgm.second);
	}
	
	public Point getFirstPoint(){
		return first;
	}
	
	public Point getSecondPoint(){
		return second;
	}
	
	public double getLength(){
		return Math.sqrt(Math.pow((second.getX()-first.getX()),2)+Math.pow((second.getY()-first.getY()),2));
	}
	
	public String toString(){
		String result = "Line[(" + first.getX() + "," + first.getY() + "),(" + second.getX() + "," + second.getY() + ")]";
		return result;
	}
	
	public boolean equals(LineSegment sg){
		if(this.first.equals(sg.first) && this.second.equals(sg.second)){
			return true;
		}
		else{
			return false;
		}
	}

	
	@Override
	public int hashCode() {
	    int hash = 17;
	    hash = hash * 23 + first.hashCode();
	    hash = hash * 23 + second.hashCode();
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
		LineSegment other = (LineSegment) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
