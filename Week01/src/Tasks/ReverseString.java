package Tasks;

public class ReverseString {
	
	public String reverseMe(String argument){
		String reverseArgument="";
		int i=0;
		for(i=argument.length()-1;i>=0;i--){
			reverseArgument = reverseArgument+argument.charAt(i);
		}
		return reverseArgument;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
