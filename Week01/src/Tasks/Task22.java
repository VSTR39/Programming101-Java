package Tasks;

public class Task22 {
	
	int getPalindromeLength(String input) throws Exception{
		Task18 t = new Task18();
		int i=input.lastIndexOf('*')+1;
		int j=input.lastIndexOf('*')-1;
		int countPalindromeLength=0;
		if(t.firstIndex(input, '*')==input.lastIndexOf('*')){
			while(i<input.length()&&j>=0&&(input.charAt(i)==input.charAt(j))){
				countPalindromeLength++;
				i++;
				j--;
				
			};
		}
			
		else {
			throw new Exception("IllegalArgumentException");
		}
		return countPalindromeLength;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Task22 test = new Task22();
		System.out.println(test.getPalindromeLength("taz*zad"));
	}

}
