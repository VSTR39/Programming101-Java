package Tasks;

public class Task14 {
	public int maxSpan(int[] numbers) throws Exception{
		if(numbers.length==0){
			throw new Exception("IllegalArgumentException");
		}
		int maxSpan=0;
		int span=0;
		int i=0;
		int j=0;
		for(i=0;i<numbers.length;i++){
			for(j=0;j<numbers.length;j++){
				if(numbers[i]==numbers[j]){
					span=j;
				}
			}
			if(span>maxSpan)maxSpan=span;
		}
		return maxSpan;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Task14 test = new Task14();
		int[]c={0,2,3,0,5};
		System.out.println("Max Span is:" + test.maxSpan(c));

	}

}
