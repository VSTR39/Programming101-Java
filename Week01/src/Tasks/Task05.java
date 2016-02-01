package Tasks;

public class Task05 {

	double getAverage(int[] array)throws Exception{
		int i=0;
		double sum=0;
		if(array.length==0){
			throw new Exception("EmptyArrayException");
		}
		for(i=0;i<array.length;i++){
			sum=sum+array[i];
		}
		//System.out.println(sum);
		return (sum/array.length);
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Task05 test = new Task05();
		int[] array = {1,2,3,4,0};
		System.out.println(test.getAverage(array));
	}

}
