package friday2;

public interface Shape extends Figure{
	
	public Point getRightEnclosingPoint();
	public Point getLeftEnclosingPoint();
	public Point getTopEnclosingPoint();
	public Point getBottomEnclosingPoint();
	
}
