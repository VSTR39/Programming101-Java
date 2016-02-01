package Tasks;

public class Task03 {
	
	public int min(int[] array) throws Exception{
		int i=0;
		
		if(array.length==0){
			throw new Exception("EmptyArrayException");
		}
		
		int result=array[0];
		for(i=1;i<array.length;i++){
			if(result>array[i])result=array[i];
		}
		
		return result;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Task03 test = new Task03();
		int[] array = {1,2,3,4,0};
		System.out.println(test.min(array));
	}

}
