package wednesday;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task01 {
	
	ArrayList<String> expression;
	
	public Task01(String expr){
		int i=0;
		expression = new ArrayList();
		for(i=0;i<expr.length();i++){
			expression.add(Character.toString(expr.charAt(i)));
		}

	}
	
	boolean isCorrect(){
		int leftBracketsCount=0;
		int rightBracketsCount=0;
		int flag=1;
		boolean result=true;
	//	ListIterator<String> it = expression.listIterator();
	//	if(!expression.get(0).equals("("))return false;
	//	else if(!expression.get(expression.listIterator().).equals(")"))return false;
	//	else {
	/*		while(it.hasNext()){
				if(it.next().equals("(")&&flag==1){
					leftBracketsCount++;
					flag=1;
					if(!it.hasNext())break;
				}
				else if(it.next().equals(")")){
					if(!it.hasNext())break;
					flag = 2;
				}else if(it.next().equals("(")&&flag==2){
					if(!it.hasNext())break;
					flag=1;
					if(leftBracketsCount!=rightBracketsCount)result=false;
					leftBracketsCount=1;
					rightBracketsCount=0;
				}
			}
		}*/
		int i=0;
		for(i=0;i<expression.size();i++){
			if(expression.get(i).equals("(")&&flag==1){
				leftBracketsCount++;
				flag=1;
			}
			else if(expression.get(i).equals(")")){
				rightBracketsCount++;
				flag = 2;
			}else if(expression.get(i).equals("(")&&flag==2){
				flag=1;
				if(leftBracketsCount!=rightBracketsCount)result=false;
				leftBracketsCount=1;
				rightBracketsCount=0;
		}
	}		
		return result;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task01 test1 = new Task01("()()())))((())(");
		System.out.println(test1.isCorrect());
		Task01 test2 = new Task01("()()()");
		System.out.println(test2.isCorrect());
	}

}
