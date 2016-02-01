package Tasks;

public class FibonacciNumber {
	
	int[] fibonacci(int n){
		int []fibonacciArray = new int [n];
		int i=0;
		for(i=0;i<n;i++){
			fibonacciArray[i]=1;
		}
		if(n==0){
			return fibonacciArray;
		}
		else if(n==1){
			fibonacciArray[0]=1;
			fibonacciArray[1]=1;
			return fibonacciArray;
		}
		else {
			fibonacciArray[0]=1;
			fibonacciArray[1]=1;
			for(i=2;i<n;i++){
				fibonacciArray[i]=fibonacciArray[i-1]+fibonacciArray[i-2];
			}
		}
		return fibonacciArray;
	}
	
	long fibNumber(int n){
		StringBuilder builder = new StringBuilder();
		 long result = 0;
		 int[] array = fibonacci(n);
		 int i=0;
		 for (i=0;i<n;i++){
			 builder.append(array[i]);
			}
		 result = Long.parseLong(builder.toString());
		 return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNumber fb = new FibonacciNumber();
		System.out.println(fb.fibNumber(3));
		System.out.println(fb.fibNumber(10));
	}

}
