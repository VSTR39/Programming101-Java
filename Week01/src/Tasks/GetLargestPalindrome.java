package Tasks;

public class GetLargestPalindrome {
	public long getLargestPalindrome(long N){
		int countDigits=0;
		int i=0;
		long M=N;
		while(N!=0){
			countDigits++;
			N=N/10;
		}
		long []array = new long[countDigits];
		
		for(i=countDigits-1;i>=0;i--){
			array[i]=M%10;
			M=M/10;
		}
		long []palindrome = new long[countDigits];
		for(i=countDigits-1;i>=0;i--){
			if(array[i]>=array[countDigits-i]){
				palindrome[countDigits-i]=array[i]-(array[i]-array[countDigits-i]);
			}
			
		}
		long result=0;
		Pow product = new Pow();
		for(i=0;i<countDigits;i++){
			if(palindrome[i]!=0){
				result=result+palindrome[i]*product.pow(10,i);
			}
			else{
				result=result+product.pow(10,i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetLargestPalindrome g = new GetLargestPalindrome();
		System.out.println(g.getLargestPalindrome(123456789));

	}

}
