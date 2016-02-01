package Tasks;

public class CountConsonants {
	public long countConsonants(String word){
		long result=0;
		int i=0;
		long countLetters=0;
		for(i=0;i<word.length();i++){
			if(Character.isLetter(word.charAt(i))){
				countLetters++;
			}
		}
		CountVowels c = new CountVowels();
		return countLetters-c.countVowels(word);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountConsonants c = new CountConsonants();
		System.out.println(c.countConsonants("Java"));
		System.out.println(c.countConsonants("Theistareykjarbunga"));
		System.out.println(c.countConsonants("grrrrgh"));
		System.out.println(c.countConsonants("Github is the second best thing that happend to programmers, after the keyboard!"));

	}

}
