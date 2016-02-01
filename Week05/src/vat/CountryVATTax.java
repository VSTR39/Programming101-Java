package vat;

public class CountryVATTax {

	private final int countryId;
	// private final String countryName;
	private final double VATTax;
	private final boolean isDefault;

	public CountryVATTax() {
		countryId = 359;
		// countryName = "Bulgaria";
		VATTax = 0.20;
		isDefault = true;
	}

	public CountryVATTax(int id, double tax/* ,String name */) throws Exception {
		if (id == 359) {
			countryId = 359;
			// countryName = "Bulgaria";
			VATTax = 0.20;
			isDefault = true;
		} else if(tax<1 && id>0){
			countryId = id;
			// countryName = name;
			VATTax = tax;
			isDefault = false;
		}
		else{
			throw new Exception("IllegalArgumentException");
		}
	}

	public int getCountyId() {
		return countryId;
	}

	/*
	 * public String getCountryName(){ 
	 * return countryName;
	 *  }
	 */

	public double getVATTax() {
		return VATTax;
	}
	
	
	public boolean isDefault(){
		return isDefault;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
