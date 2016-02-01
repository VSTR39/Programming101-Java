package tasks;

public class Task01<T> {
	private T element;

	public void set(T el){
		element=el;
	}
	public T get(){
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task01<Integer> bp = new Task01();
		bp.set(1);
		System.out.println(bp.get());
		Task01<String> bp1 = new Task01();
		bp1.set("hmmm");
		System.out.println(bp1.get());
		Task01<Boolean> bp2 = new Task01();
		bp2.set(true);
		System.out.println(!bp2.get());
	}

}
