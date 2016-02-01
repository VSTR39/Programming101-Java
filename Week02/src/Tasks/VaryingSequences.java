package Tasks;

public class VaryingSequences {
	boolean IsIncreasing(int[] sequence){
		int i=0;
		boolean result=true;
		for(i=0;i<sequence.length-1;i++){
			if(sequence[i]>sequence[i+1]){
				result=false;
			}
		}
		return result;
	}
	
	boolean IsDecreasing(int[] sequence){
		int i=0;
		boolean result=true;
		for(i=0;i<sequence.length-1;i++){
			if(sequence[i]<sequence[i+1]){
				result=false;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VaryingSequences vSeq = new VaryingSequences();
		int[] a = {1,2,3,4};
		int[] b = {4,3,2,1};
		
		System.out.println(vSeq.IsIncreasing(a));
		System.out.println(vSeq.IsDecreasing(a));
		System.out.println(vSeq.IsIncreasing(b));
		System.out.println(vSeq.IsDecreasing(b));
	}

}
