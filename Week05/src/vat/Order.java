package vat;

public class Order {
	private int productId;
	private int productQuantity;
	
	public Order(int pid,int quantity){
		productId = pid;
		productQuantity = quantity;
	}
	
	
	public int getProductId() {
		return productId;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
