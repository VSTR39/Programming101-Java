package Tasks;

public class Pow {
	
	public long pow(int a,int b){
		int result=1;
		while(b>0){
			if(b%2==0){
				b=b/2;
				a=a*a;
			}
			else{
				result=result*a;
				b--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pow p = new Pow();
		System.out.println(p.pow(2,5));
	}

}
