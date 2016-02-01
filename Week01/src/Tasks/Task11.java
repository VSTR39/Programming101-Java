package Tasks;

public class Task11 {
	
	public double  pow(int a,int b){
		int x=a;
		int y=b;
		double result=1;
		if(y<0){
			y=-y;
		}
		if(b!=0){
			while(y>0){
				if(y%2==0){
					y=y/2;
					x=x*x;
				}
				else{
					result=result*x;
					y--;
				}	
			
			}
		}
		else {
			return 1;
		}
			
		if(b>=0){
			return result;
		}
		else {
			return (1/result);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task11 test = new Task11();
		System.out.println(test.pow(1, 5));
		System.out.println(test.pow(2, 5));
		System.out.println(test.pow(-2, 4));
		System.out.println(test.pow(-2, 5));
		System.out.println(test.pow(-2, -5));
		System.out.println(test.pow(2, -5));

	}

}
