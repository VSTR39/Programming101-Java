package Tasks;

public class Task04 {
	
	public int kthMin(int k,int[]array)throws Exception{
		
		int []arrayOfMins = new int[array.length];
		int i=0;
		int j=0;
		int temp=0;
		
		if(array.length==0){
			throw new Exception("EmptyArrayException");
		}
		
		for(i=0;i<arrayOfMins.length;i++){
			arrayOfMins[i]=array[i];
		}
		
		for(i=0;i<array.length;i++){
			for(j=i;j<arrayOfMins.length;j++){
				if(arrayOfMins[i]>array[j]){
					temp=arrayOfMins[i];
					arrayOfMins[i]=array[j];
					array[j]=temp;
					//System.out.println(arrayOfMins[i]);
				}
				
			}
		}
		
		return arrayOfMins[k-1];
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Task04 test = new Task04();
		int[] array = {1,2,3,4,0};
		System.out.println(test.kthMin(4,array));

	}

}
