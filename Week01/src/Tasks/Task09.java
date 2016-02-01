package Tasks;

public class Task09 {
	long getLargestPalindrome(long N)throws Exception{
		if(N<=0){
			throw new Exception("IllegalArgumentException");
		}
		int i=0;
		long  number=N;
		int countDigits=0;
		while(N!=0){
			countDigits++;
			N=N/10;
		}
		int[] digits = new int[countDigits];
		for(i=countDigits-1;i>=0;i--){
			digits[i]=(int) (number%10);
			number=number/10;
		}
		boolean rightIsBigger=false;
		int[] largestPalindrome = new int[countDigits];
		for(i=countDigits-1;i>=0;i--){
			if(countDigits/2<i){
				if(digits[i]>digits[(countDigits-1)-i]){
					largestPalindrome[i]=digits[i]-(digits[i]-digits[countDigits-1-i]);
					rightIsBigger=true;
				}
				else if(digits[i]<digits[(countDigits-1)-i]){
					largestPalindrome[i]=digits[(countDigits-1)-i];
					rightIsBigger=false;
				}

			}
			else {
				largestPalindrome[i]=digits[i];
			}
		}
		long result=0;
		Task11 t = new Task11();
		if(digits.length%2!=0){
			if(!rightIsBigger){
				largestPalindrome[countDigits/2]--;
			}
		}
		long temp=0;
		for(i=0;i<countDigits;i++){
			if(largestPalindrome[i]!=0){
				result=(long) (result+largestPalindrome[i]*t.pow(10,i));
			}
			else{
				result=(long) (result+t.pow(10,i));
				temp=(long) (temp+t.pow(10,i));
			}
		}
		return result-temp;

	}
	

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Task09 test = new Task09();
		System.out.println(test.getLargestPalindrome(123459876));
		
	}

}
