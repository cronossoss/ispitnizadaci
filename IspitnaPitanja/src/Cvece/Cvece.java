package Cvece;

public class Cvece {
	private String naziv;
	private int god;
	private double cena;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getGod() {
		return god;
	}
	
	public void setGod(int god) {
		this.god = god;
	}
	
	public double getCena() {
		return cena;
	}
	
	public void setCena(double cena) {
		this.cena = cena;
	}

	public Cvece(String naziv, int god, double cena) {
		super();
		this.naziv = naziv;
		this.god = god;
		this.cena = cena;
	}

	
	@Override
	public String toString() {
		return "Cveæe " + naziv + ", može da živi " + god + ". Prodajna cena je " + Prodajna() + "";
	}
	
	public double Prodajna() {
		return cena*1.1;
	}
	
}
