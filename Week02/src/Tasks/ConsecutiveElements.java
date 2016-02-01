package Tasks;

public class ConsecutiveElements {
	
	int maxEqualConsecutive(int[] items){
		
		int count=0;
		int maxCount=0;
		int i=0;
		for(i=0;i<items.length-1;i++){
			if(items[i]<=items[i+1]){
				count++;
			}
			else{
				if(count>maxCount){
					maxCount=count;
					count=0;
				}
				else{
					count=0;
				}
			}
		}
		if(maxCount==0&&count!=0)return count+1;
		return maxCount+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsecutiveElements c = new ConsecutiveElements();
		int arrayp[]={1, 2, 3, 3, 3, 3, 4, 3, 3};
		int array[]={1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
		System.out.println(c.maxEqualConsecutive(arrayp));
		System.out.println(c.maxEqualConsecutive(array));
	}

}
