package vat;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShopInventory {
	ArrayList<Product> product;
	private int countryId;
	private double priceBeforeTaxes;
	private double priceAfterTaxes;

	public ShopInventory(ArrayList<Product> prod, int cid, double beforeTax,VATTaxCalculator c) throws Exception {
		product = prod;
		countryId = cid;
		priceBeforeTaxes = beforeTax;
		priceAfterTaxes = c.CalculateTax(beforeTax,countryId);
	}
	
	public ArrayList<Product> getProductsList(){
		return product;
	}
	public double audit(){
		double sum = 0;
		int i=0;
		ListIterator listIt = product.listIterator();
		while(listIt.hasNext()){
			sum = sum + product.get(i).getProductQuantity()*priceAfterTaxes;
			i++;
		}
		return sum;
	}
	
	public void requestOrder(Order order) throws Exception{
		boolean isProductInInventory = false;
		ListIterator listIt = product.listIterator();
		int i=0;
		int index=0;
		while(listIt.hasNext()){
			if(product.get(i).getProductId()==order.getProductId()){
				isProductInInventory=true;
				index=i;
			}
		}
		
		if(isProductInInventory){
			if(product.get(index).getProductQuantity()<order.getProductQuantity()){
				System.out.println("Not enough mana");
				throw new Exception("MoreGoldIsRequired");
			}
			else{
				product.get(index).setProductQuantity(product.get(index).getProductQuantity()-order.getProductQuantity());
			}
		}
	}
}
