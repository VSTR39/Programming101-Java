package Tasks;

public class UniqueWords {
	int uniqueWordsCount(String[] arr){
		int i=0;
		int j=0;
		int result=0;
		boolean isUnique=true;
		for(i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length;j++){
				if(arr[i].equals(arr[j])){
					isUnique=false;
				}
			}
			if(isUnique){
				result++;
			}
			else{
				isUnique=true;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		UniqueWords uWord = new UniqueWords();
		System.out.println(uWord.uniqueWordsCount(new String[] {"apple", "banana", "apple", "pie"}));
		System.out.println(uWord.uniqueWordsCount(new String[] {"java", "java", "java", "android"}));
		System.out.println(uWord.uniqueWordsCount(new String[] {"HELLO!", "HELLO!", "HELLO!","HELLO!"}));
	}
}
