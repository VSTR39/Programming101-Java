package Tasks;

public class Task23 {
	int countOcurrences(String needle, String haystack){
		int countOccurences=0;
		int count=0;
		int i=0;
		int j=0;
		for(i=0;i<haystack.length();i++){

			while(needle.charAt(j)==haystack.charAt(i)){
				
				count++;
				j++;
				
				if(j==needle.length())break;
				i++;
			}
			if(count==needle.length()){
				countOccurences++;
				j=0;
				count=0;
			}
			else{
				j=0;
				count=0;
			}
			System.out.println("+++");
		}
		
		return countOccurences;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task23 test = new Task23();
		System.out.println(test.countOcurrences("da", "daaadaadada"));
	}

}
