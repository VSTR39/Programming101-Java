package Tasks;

public class Task18 {
	public int firstIndex(String str,char c){
		int i=0;
		int firstIndex=-1;
		for(i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				firstIndex=i;
				break;
			}
		}
		return firstIndex;
	}
	
	public String reverseEveryChar(String arg){
		String result="";
		int i=0;
		int j=0;
		Task17 t = new Task17();
		for(i=0;i<arg.length();i++){
			if(arg.charAt(i)==' '){
				result=result+t.reverseMe(arg.substring(j,i));

				j=i;
				if(j==arg.lastIndexOf(' ')){
					result=result+t.reverseMe(arg.substring(j,arg.length()));
					break;
				}
				else {
					result=result + arg.charAt(i);
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task18 test = new Task18();
		System.out.println(test.reverseEveryChar("What is  this"));
	}

}
