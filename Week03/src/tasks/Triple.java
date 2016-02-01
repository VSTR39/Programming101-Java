package tasks;

public class Triple <T,S,R>{
	private T first;
	private S second;
	private R third;
	
	public Triple(T el1,S el2 , R el3){
		first = el1;
		second = el2;
		third = el3;
	}
	
	public void setFirst(T el1){
		first = el1;
	}
	
	public T getFirst(){
		return first;
	}
	
	public void setSecond(S el2){
		second = el2;
	}
	
	public S getSecond(){
		return second;
	}
	
	public void setThird(R el3){
		third = el3;
	}
	
	public R getThird(){
		return third;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
