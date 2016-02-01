package Tasks;

public class Task08 {
	public long getGreatestCommonDivisor(long x,long y){
		long remainder=1;
		do{
			if(x>y) {
				remainder=x%y;
				if(remainder==0)return y;
				x=remainder;
			}
			else {
				remainder=y%x;
				if(remainder==0)return x;
				y=remainder;				
			}
			
		}while(true);
		
	}
	
	public long getSmallestMultiple(int upperBound){
		int i=0;
		long lowestCommonMultiple;
		int[] array = new int[upperBound];
		for(i=0;i<upperBound;i++){
			array[i]=i+1;
		}
		lowestCommonMultiple=array[upperBound-1];
		for(i=upperBound;i>=2;i--){
			lowestCommonMultiple=((i*lowestCommonMultiple)/getGreatestCommonDivisor(i,lowestCommonMultiple));
		}
		
		return lowestCommonMultiple;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task08 test = new Task08();
		System.out.println(test.getSmallestMultiple(13));
	}

}
