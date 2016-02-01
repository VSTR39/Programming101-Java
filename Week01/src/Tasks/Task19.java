 package Tasks;

public class Task19 {
	boolean isPalindrome(String argument){
		Task17 t = new Task17();
		if(argument.length()%2==0){
			if(argument.substring(0, argument.length()/2).equals(t.reverseMe(argument.substring(argument.length()/2, argument.length())))){
				return true;
			}
			else {
				return false;
			}
		}
		else{
			if(argument.substring(0, argument.length()/2).equals(t.reverseMe(argument.substring(argument.length()/2+1, argument.length())))){
				return true;
			}
			else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "bob";
		Task19 test = new Task19();
		System.out.println(test.isPalindrome(word));

	}

}
