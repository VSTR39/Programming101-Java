package Tasks;

public class CountVowels {
	long countVowels(String word){
		long countVowels=0;
		int i=0;
		for(i=0;i<word.length();i++){
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='y'){
				countVowels++;
			}
		}
		return countVowels;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountVowels c = new CountVowels();
		System.out.println(c.countVowels("Java"));
		System.out.println(c.countVowels("Theistareykjarbunga"));
		System.out.println(c.countVowels("grrrrgh"));
		System.out.println(c.countVowels("Github is the second best thing that happend to programmers, after the keyboard!"));

	}

}
