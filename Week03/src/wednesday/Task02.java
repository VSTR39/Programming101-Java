package wednesday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class Task02<T> {
	
	ArrayList<T> collection;
			
	public Task02 (){
		collection = new ArrayList<T>();
	}
	
	public void reverse(){
		
		ArrayList<T> rev = new ArrayList<T>();
		int i;
		for(i=this.collection.size()-1;i>=0;i--){
			rev.add(this.collection.get(i));
		}
		this.collection.clear();
		for(i=0;i<rev.size();i++){
			this.collection.add(rev.get(i));
		}
				
	}

	public static void main(String[] args) {
		Task02<String> test =  new Task02();
		test.collection.add("a");
		test.collection.add("b");
		test.collection.add("c");
		test.reverse();
		int i=0;
		for (i=0;i<test.collection.size();i++){
			System.out.println(test.collection.get(i));
		}
		
	}
}
