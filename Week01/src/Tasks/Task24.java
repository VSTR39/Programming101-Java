package Tasks;

public class Task24 {
	String decodeUrl(String input){
		int i=0;
		StringBuilder result = new StringBuilder();
		for(i=0;i<input.length();i++){
			if(Character.isLetter(input.charAt(i))||input.charAt(i)=='.'){
				result = result.append(input.charAt(i));
			}
			else if(input.charAt(i)=='%'){
				if(input.substring(i,i+3).equals("%20")){
					result = result.append(" ");
				}
				if(input.substring(i,i+3).equals("%3A")){
					result = result.append(':');
				}
				if(input.substring(i,i+3).equals("%3D")){
					result = result.append('?');
				}
				if(input.substring(i,i+3).equals("%2F")){
					result = result.append('/');
				}
			}
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task24 test = new Task24();
		System.out.println(test.decodeUrl("kitten%20pic.jpg'"));
	}

}
