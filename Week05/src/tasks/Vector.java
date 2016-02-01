package tasks;

import java.util.ArrayList;

public class Vector {
	
	ArrayList<Double> vector = new ArrayList<>();
	
	public Vector(Double...args ){
		for(Double arg:args){
			vector.add(arg);
		}
	}
	
	public Vector(ArrayList<Double> vctr) {
		vector = vctr;
	}
	
	public Vector(Vector vc){
		this(vc.vector);
	}
	
	public void setX(int index,Double x){
		vector.set(index, x);
	}
	
	public Double getX(int index){
		return vector.get(index);
	}
	
	public int getDimensions(){
		int i=0;
		int dimensions = 0;
		for(i=0;i<vector.size();i++){
			dimensions++;
		}
		return dimensions;
	}
	
	public double getVectorLength(){
		int i=0;
		double sum = 0;
		for(i=0;i<vector.size();i++){
			sum = sum + Math.pow(vector.get(i), 2);
		}
		return Math.sqrt(sum);
	}
		

	@Override
	public String toString() {
		return "Vector [vector=" + vector + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vector == null) ? 0 : vector.hashCode());
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
		Vector other = (Vector) obj;
		if (vector == null) {
			if (other.vector != null)
				return false;
		} else if (!vector.equals(other.vector))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
