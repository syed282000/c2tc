package capgm.application;
import capgm.framework.NormalAccount;
import capgm.framework.PrimeAccount;
import capgm.framework.Shopfactory;

public class GSShopFactory implements Shopfactory {

	@Override
	public PrimeAccount getNewPrimeAccount(int accno, String accname, float charges) {
		PrimeAccount pa=new PrimeAccount(accno, accname, charges);
		return pa;
	}

	@Override
	public NormalAccount getNewNormalAccount(int accno, String accname, float charges) {
		NormalAccount na=new NormalAccount(accno, accname, charges);
		return na;
	}
}
