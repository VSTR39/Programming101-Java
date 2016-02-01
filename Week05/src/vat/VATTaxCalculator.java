package vat;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

public class VATTaxCalculator {
	
	private ArrayList<CountryVATTax> calculator;
	

	public VATTaxCalculator(ArrayList<CountryVATTax> calc){
		calculator = calc;
//		ListIterator listIt = calculator.listIterator();
	}
	
	/* Note : the program doesn't check if there is a
	 * reiteration of some country in the list (there should not be such)
	 */
//	public boolean isUnique(ArrayList<CountryVATTax> calc){
//		ListIterator listIt = calculator.listIterator();
		
//	}
	public double CalculateTax(double price){
		CountryVATTax def = new CountryVATTax();
		return def.getVATTax()*price;
	}
	
	public double CalculateTax(double price,int id) throws Exception{
		ListIterator<CountryVATTax> listIt = calculator.listIterator();
		double result = 0;
		while(listIt.hasNext()){
			if(listIt.next().getCountyId()==id){
				result = listIt.next().getVATTax()*price;
				return result;
			}
		}
		if(result == 0){
			throw new Exception("CountryNotSupportedException");
		}
		return result;
	}
	
	public ArrayList<CountryVATTax> getCalculator(){
		return calculator;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
