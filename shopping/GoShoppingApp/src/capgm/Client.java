package capgm;

import capgm.application.GSPrimeAcc;
import capgm.application.GSShopFactory;
import capgm.framework.NormalAccount;
import capgm.framework.PrimeAccount;
import capgm.framework.Shopfactory;

public class Client {

	public static void main(String[] args) {
		Shopfactory sf=new GSShopFactory();
		GSPrimeAcc pa=new GSPrimeAcc(786, "Suhel", 1000);
		pa.bookProducts(500);;
		NormalAccount na=new NormalAccount(123, "prem" ,31);
		na.bookProducts(500);
}
}
