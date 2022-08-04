package capgm.framework;

public class  PrimeAccount extends ShopAccount{
	public PrimeAccount(int accno,String accname, float charges) {
		super(accno, accname, charges);
		//TODO auto-generated constructor stub
	}
	private static boolean isprime=true;

	@Override
	public String toString() {
		return "PrimeAccount [isprime=" + isprime + ", getAccno()=" + getAccno() + ", getAccname()=" + getAccname()
				+ ", getCharges()=" + getCharges() + "]";
	}
	
}
