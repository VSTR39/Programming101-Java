package Tasks;

public class LucasSeries {
	int nthLucas(int n) throws Exception{
		int[] lucasSeries = new int[n];
		int i = 0;
		if(n==0){
			throw new Exception("IllegalArgumentException");
		}
		else if(n==1){
			lucasSeries[0]=2;
			return lucasSeries[n-1];
		}
		else if(n==2){
			lucasSeries[0]=2;
			lucasSeries[1]=1;
			return lucasSeries[n-1];
		}
		else {
			lucasSeries[0]=2;
			lucasSeries[1]=1;
			for(i=2;i<n;i++){
				lucasSeries[i]=lucasSeries[i-1]+lucasSeries[i-2];
			}
		}
		
		return lucasSeries[n-1];
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LucasSeries ls = new LucasSeries();
		System.out.println(ls.nthLucas(7));
	}

}
