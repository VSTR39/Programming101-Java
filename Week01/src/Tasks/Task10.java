package Tasks;

public class Task10 {
	
	int[] histogram(short[][] image) throws Exception{
		if(image.length==0){
			throw new Exception("IllegalArgumentException");
		}
		int []result = new int [image.length];
		int i=0;
		int j=0;
		
		for(i=0;i<result.length;i++){
			result[i]=0;
		}
		
		for(i=0;i<image.length;i++){
			for(j=0;j<image.length;i++){
				if(image[i][j]==j){
					result[j]++;
				}
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
