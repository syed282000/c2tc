package capgm.application;

import capgm.framework.PrimeAccount;

public class GSPrimeAcc extends PrimeAccount {

	public GSPrimeAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProducts(float charges) {
	   System.out.println("You have purchased the product of charges" +charges); 
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getAccno()=" + getAccno() + ", getAccname()="
				+ getAccname() + ", getCharges()=" + getCharges() + "}";
	}

}
