package Cvece;

public class Drvenasto extends Cvece {
	public double visina;

	public Drvenasto(String naziv, int god, double cena, double visina) {
		super(naziv, god, cena);
		this.visina = visina;
	}

	@Override
	public String toString() {
		return getNaziv() + " moe da ivi " + getGod()
				+ ". Prodajna cena je " + getCena() + " din. i ima visinu do " + visina + " m";
	}
	
	@Override
	public double Prodajna() {
		if (visina > 1)
			return super.Prodajna()*1.25;
		else
			return super.Prodajna()*1.15;
	}
	
	
	

}
