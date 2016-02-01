package Tasks;

public class Task20 {
	
	boolean isPalindrome(int argument){
		String number="";
		int i=0;
		int countDigits=0;
		int N=argument;
		while(N!=0){
			countDigits++;
			N=N/10;
		}
		
		for(i=countDigits;i>0;i--){
			number = number + (argument%10);
			argument=argument/10;
		}

		Task19 t = new Task19();
		return t.isPalindrome(number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task20 test = new Task20();
		System.out.println(test.isPalindrome(12300));
		
	}

}
