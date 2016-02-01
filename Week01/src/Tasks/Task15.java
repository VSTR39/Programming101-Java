package Tasks;

public class Task15 {
	public boolean canBalance(int[] numbers){
		int total=0;
		int sumLeft=0;
		int sumRigth=0;
		int i=0;
		int j=0;
		boolean flag=false;
		for(i=0;i<numbers.length;i++){
			total=total+numbers[i];
		}
		if(total%2!=0)return false;
		else{
			for(i=0;i<numbers.length;i++){
				sumLeft=sumLeft+numbers[i];
				for(j=i;j<numbers.length;j++){
					sumRigth=sumRigth+numbers[j];
				}
				if(sumLeft==sumRigth){
					flag=true;
				}
				sumLeft=0;
				sumRigth=0;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task15 test = new Task15();
		int[]a={0,2,3,0,5};
		System.out.println(test.canBalance(a));
	}

}
