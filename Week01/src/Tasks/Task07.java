package Tasks;

public class Task07 {
	long kthFactoriel(long k,long n) throws Exception{
		long i=0;
		long result = 1;
		long j=0;
		long temp=1;
		if(k<=0){
			throw new Exception("IllegalArgumentException");
		}
		
		for(i=0;i<k;i++){
			for(j=2;j<=n;j++){
				temp = temp * j;
			}
			n=temp;
			result=temp;
			temp=1;
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Task07 test = new Task07();
		System.out.println(test.kthFactoriel(2, 3));

	}

}
