package Tasks;

public class Task01 {
	int n;
	
	public Task01(int x){
		n=x;
	}
	
	boolean isOdd(int n){
		return !(n%2==0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task01 test = new Task01(4);
		System.out.println(test.isOdd(3));
	}

}
