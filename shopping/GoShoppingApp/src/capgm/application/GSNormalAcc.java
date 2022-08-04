package capgm.application;

import capgm.framework.NormalAccount;

public class GSNormalAcc extends NormalAccount{

	public GSNormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProducts(float charges) {
		System.out.println("You have purchased the product with charges" +charges+" along with delivery charges" +deliverycharges);
	}
	

}
