package vat;

public class Product {
	
	private int productId;
	private String productName;
	private int productQuantity;

	
	public Product(int pid,String pName,int pQuantity,double price){
		productId = pid;
		productName = pName;
		productQuantity = pQuantity;
		/*
		 * Note: Again product names should be unique
		 */
	}
	public int getProductId(){
		return productId;
	}
	
	public int getProductQuantity(){
		return productQuantity;
	}
	public void setProductQuantity(int quantity){
		productQuantity=quantity;
	}
	public String getProductName(){
		return productName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
