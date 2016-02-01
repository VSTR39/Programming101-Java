package Tasks;

public class Task12 {
	
	public int getOddOccurrence(int[] array) throws Exception{
		if(array.length==0){
			throw new Exception("IllegalArgumentException");
		}
		int i=0;
		int j=0;
		int count=0;
		int oddOccurence=0;
			for(i=0;i<array.length;i++){
				for(j=0;j<array.length;j++){
					if(array[i]==array[j])count++;
				}
				if(count%2!=0){
					oddOccurence=array[i];
					break;
				}
			}
			return oddOccurence;
			
		}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Task12 test = new Task12();
		int []array = { 1,2,2,1,3,4,3,4,4,6,5,6,5 };
		System.out.println(test.getOddOccurrence(array));
	}

}
