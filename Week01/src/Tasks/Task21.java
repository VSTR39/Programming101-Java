package Tasks;

public class Task21 {
	
	String copyEveryChar(String input, int k) throws Exception{
		if(k<0){
			throw new Exception("IllegalArgumentException");
		}
		StringBuilder result = new StringBuilder();
		int i=0;
		int j=0;
		for(i=0;i<input.length();i++){
			for(j=0;j<k;j++){
				result = result.append(input.charAt(i));
			}
		}
		
		return result.toString();
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Task21 test = new Task21();
		System.out.println(test.copyEveryChar("tldr", 3));

	}

}
