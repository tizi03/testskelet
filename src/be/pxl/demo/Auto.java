package be.pxl.demo;

public class Auto {
	private String merk;
	private String eigenaar;
	private double prijs;

	public Auto(String merk, String eigenaar, double prijs) {
		// TODO: implementeer deze constructor
	}

	public Auto(String merk, double prijs) {
		// TODO: implementeer deze constructor
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public String getEigenaar() {
		return eigenaar;
	}

	public void setEigenaar(String eigenaar) {
		this.eigenaar = eigenaar;
	}

	public void verhoogPrijs(int percent) {
		// TODO: implementeer deze methode
	}
}
