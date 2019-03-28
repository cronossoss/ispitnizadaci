package Cvece;

public class Sobno extends Cvece{
	
	protected boolean otrovno;
	
	public Sobno(String naziv, int god, double cena, boolean otrovno) {
		super(naziv, god, cena);
		this.otrovno = otrovno;
	}

	@Override
	public String toString() {
		return "Cveæe " + getNaziv() + " može da živi " + getGod()
				+ ". Prodajna cena je " + Prodajna() + " din. i otrovno je " + otrovno;
	}
	
	@Override
	public double Prodajna() {
		if (otrovno==true)
			return super.Prodajna()*1.25;
		else
			return super.Prodajna();
	}
	

	

	
	

}
