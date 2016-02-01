package Tasks;

public class Task06 {
	
	long factorial(long n) throws Exception{
		if(n<0){
			throw new Exception("IllegalArgumentException");
		}
		long result=1;
		long i=0;
		for(i=n;i>1;i--){
			result = result * i;
		}
		return result;
	}
	
	long doubleFactorial(long n) throws Exception{
		return factorial(factorial(n));
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Task06 test = new Task06();
	//	System.out.println(test.doubleFactorial(-3));
		
	}
	

}
