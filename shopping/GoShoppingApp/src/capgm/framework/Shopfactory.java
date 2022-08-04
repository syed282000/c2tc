package capgm.framework;

public interface Shopfactory {
	
	public PrimeAccount getNewPrimeAccount(int accno, String accname, float charges);
    public NormalAccount getNewNormalAccount(int accno, String accname, float charges);
}
