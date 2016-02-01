package Tasks;

public final class Pair {
	private final Object first;
	private final Object second;
	
	public Pair(Object ob1,Object ob2){
		this.first = ob1;
		this.second = ob2;
	}
	
	public Object getFirst(){
		return first;
	}
	
	public Object getSecond(){
		return second;
	}
	
	public String toString(){
		String resultLeft = (String)first;
		String resultRigth = (String)second;
		return resultLeft + resultRigth;
	}
	
	public boolean equals(Pair ob){
		if((this.first==ob.first)&&(this.second==ob.second)){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Pair ob1 = new Pair("a","b");
		Pair ob2 = new Pair("c","d");
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.getFirst());
		System.out.println(ob1.getSecond());
		System.out.println(ob2.getFirst());
		System.out.println(ob2.getSecond());
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		
	}

}
