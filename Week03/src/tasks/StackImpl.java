package tasks;

import java.util.ArrayList;

public class StackImpl<T> {
	private ArrayList<T> stack;
	private int topOfStack;
	public StackImpl(){
		topOfStack=0;
		stack = new ArrayList<>();
	}
	
	public boolean isEmpty(){
		if(topOfStack==0)return true;
		else return false;
	}
	
	public void push(T element){
		stack.add(element);
		topOfStack++;
	}
	
	public T pop() throws Exception{
		if(!this.isEmpty()){
			topOfStack--;
			return stack.remove(topOfStack);
		}
		else {
			throw new Exception("EmptyStackException");
		}
	}
	
	public int legth(){
		return topOfStack;
	}
	
	public void clear(){
		while(topOfStack!=0){
			stack.remove(topOfStack);
			topOfStack--;
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackImpl<String> st1 = new StackImpl<String>();
		StackImpl<Integer> st2 = new StackImpl<Integer>();
		System.out.println(st1.isEmpty());
		System.out.println(st2.isEmpty());
		st1.push("a");
		st1.push("b");
		st1.push("c");
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		st2.push(1);
		st2.push(2);
		st2.push(3);
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		
	}

}
