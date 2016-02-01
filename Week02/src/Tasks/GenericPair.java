package Tasks;

public class GenericPair<T>{
	
	private final T firstT;
	private final T secondT;
	
	public GenericPair(T ob1,T ob2){
		this.firstT = ob1;
		this.secondT = ob2;
	}
	
	public T getFirst(){
		return firstT;
	}
	
	public T getSecond(){
		return secondT;
	}
	
	public String toString(){
		
		return String.format("%s%s", firstT,secondT);
	}
	
	public boolean equals(GenericPair ob){
		if((this.firstT==ob.firstT)&&(this.secondT==ob.secondT)){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericPair<Integer> ob1 = new GenericPair(1,1);
		GenericPair<Integer> ob2 = new GenericPair(2,3);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.getFirst());
		System.out.println(ob1.getSecond());
		System.out.println(ob2.getFirst());
		System.out.println(ob2.getSecond());
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());

	}

}
