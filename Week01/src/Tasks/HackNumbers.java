package Tasks;

public class HackNumbers {
	
	public boolean isHack(long n){
		long m=n;
		StringBuilder number = new StringBuilder();
		int count1=0;
		while(m/2!=0){
			if(m%2==0){
				number.append('1');
				count1++;
			}
			else{
				number.append('0');
			}
			m=m/2;
		}
		System.out.println(number);
		StringBuilder leftHalfStrBuilder = new StringBuilder();
		StringBuilder rightHalfStrBuilder  = new StringBuilder();
		String leftHalf;
		String rightHalf;
		ReverseString reverser = new ReverseString();
		if(count1%2==0){
			return false;
		}
		else{
			if(number.length()%2==0){
				leftHalf = number.substring(0, number.length()/2);
				rightHalf = reverser.reverseMe(number.substring(number.length()/2, number.length()));
				if(leftHalf.equals(rightHalf))return true;
				else return false;
			}
			else {
				leftHalf = number.substring(0, number.length()/2);
				rightHalf = reverser.reverseMe(number.substring(number.length()/2+1, number.length()));
				if(leftHalf.equals(rightHalf))return true;
				else return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HackNumbers hackNumber = new HackNumbers();
		System.out.println(hackNumber.isHack(7));
	}

}
