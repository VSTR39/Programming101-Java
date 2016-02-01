package Tasks;

public class Task25 { 
	double sum (double[] arrayOfNumbers){
		int i=0;
		double result=0;
		for(i=0;i<arrayOfNumbers.length;i++){
			result=result + arrayOfNumbers[i];
		}
		
		return result;
	}
	
	double sumOfNumbers(String input){
		int i=0;
		int numbersCount=0;
		double number=0;
		int power=1;
		int j=0;
		Task11 t = new Task11();
		double[] arrayOfNumbers = new double[input.length()];
		for(i=0;i<input.length();i++){
			while(Character.isDigit(input.charAt(i))){
				int x = Integer.parseInt(input.substring(i,i));
				number = number + 	x*t.pow(10, power);
				System.out.println(number);
				i++;
				if(i==input.length()){
					break;
				}
				power++;
			}
			
			if(number!=0){
				arrayOfNumbers[j]=number;
				System.out.println(arrayOfNumbers[j]);
				j++;
			}
			number=0;
			power=1;
			
		}
		
		return sum(arrayOfNumbers);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task25 test = new Task25();
		
		System.out.println(test.sumOfNumbers("abc123dd34"));

	}

}
