package Tasks;

public class StackImpl {

	private int size;
	private int topOfStack;
	protected int[] stack;

	public StackImpl(int sz) {
		topOfStack = 0;
		size = sz;
	}

	public void init() {
		this.stack = new int[size];
	}

	public boolean isEmpty() {
		if (this.topOfStack == 0)
			return true;
		else
			return false;
	}

	public int length() {
		return this.size;
	}

	public void clear() {
		this.topOfStack = 0;
	}

	public void push(int x) throws Exception {
		if (this.topOfStack == this.size) {
			throw new Exception("StackFullException");
		} else {
			this.topOfStack++;
			this.stack[this.topOfStack] = x;
		}
	}

	public int pop() throws Exception {
		if (this.topOfStack == 0) {
			throw new Exception("StackEmptyException");
		} else {
			return this.stack[this.topOfStack--];
		}
	}

	public static void main(String[] args) throws Exception {

		StackImpl st = new StackImpl(10);
		System.out.println(st.isEmpty());
		System.out.println(st.length());
		st.init();
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}

}