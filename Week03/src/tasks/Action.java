package tasks;

public class Action <T1 extends Number,T2 extends Number>{
	
	private T1 first;
	private T2 second;
	
	public Action(T1 el1,T2 el2){
		first = el1;
		second = el2;
	}
	
	public double sum(T1 number1,T2 number2){
		return (double)number1 + (double)number2;
	}
	
	public double subtraction(T1 number1,T2 number2){
		return (double)number1 - (double)number2;
	}
	
	public double multiplication(T1 number1,T2 number2){
		return (double)number1 * (double)number2;
	}
	
	public double division(T1 number1,T2 number2){
		return (double)number1 / (double)number2;
	}
	
	public double pow(T1 number1,T2 number2){
		return Math.pow((double)number1, (double)number2);
	}
	
	public double factoriel (T1 number){
		double i=(double) number;
		double result=1;
		for(i=(double) number;i>=1;i--){
			result = result*i;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
