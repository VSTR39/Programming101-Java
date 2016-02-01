package tasks;


public final class Task02<T,S> {
	private T first;
	private S second;
	
	public Task02(T ob1,S ob2){
		this.first = ob1;
		this.second = ob2;
	}
	
	public void setFirst(T el){
		first=el;
	}
	
	public T getFirst(){
		return first;
	}
	
	public void setSecond(S el){
		second=el;
	}
	
	public S getSecond(){
		return second;
	}
	
	public String toString(){
		String resultLeft = (String)first;
		String resultRigth = (String)second;
		return resultLeft + resultRigth;
	}
	
	public boolean equals(Task02 ob){
		if((this.first==ob.first)&&(this.second==ob.second)){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Task02 ob1 = new Task02("a","b");
		Task02 ob2 = new Task02("s",2);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.getFirst());
		System.out.println(ob1.getSecond());
		System.out.println(ob2.getFirst());
		System.out.println(ob2.getSecond());

		
	}
}
