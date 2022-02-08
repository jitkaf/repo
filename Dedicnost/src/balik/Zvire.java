package balik;

import java.time.LocalDate;
import java.util.List;

public class Zvire {
	private LocalDate datumNarozeni;
	private List<Integer> hodinyKrmeni;
	private int pocetKrmeniZaDen; 
	private String jmeno;
	private boolean zijeVCesku;
	
	public Zvire(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		this.datumNarozeni = datumNarozeni;
		this.jmeno = jmeno;
		this.zijeVCesku = zijeVCesku;
	}
	
	public void vypisInformace() {
		System.out.println("Datum narození: " + datumNarozeni);
		System.out.println("Poèet hodin krmení za den: " + this.pocetKrmeniZaDen);
		System.out.println("Jméno: " + this.jmeno);
		System.out.println("Žije v èesku: " + (this.zijeVCesku ? "Ano" : "Ne"));
		if (hodinyKrmeni != null && !hodinyKrmeni.isEmpty()) {
			System.out.println("---krmeni: " + hodinyKrmeni);
		}
		else {
			System.out.println("Zvire neni krmeno.");
		}
	}

	public List<Integer> getHodinyKrmeni() {
		return hodinyKrmeni;
	}

	public void setHodinyKrmeni(List<Integer> hodinyKrmeni) {
		this.hodinyKrmeni = hodinyKrmeni;
	}

	public int getPocetKrmeniZaDen() {
		return pocetKrmeniZaDen;
	}

	public void setPocetKrmeniZaDen(int pocetKrmeniZaDen) {
		this.pocetKrmeniZaDen = pocetKrmeniZaDen;
	}

	public LocalDate getDatumNarozeni() {
		return datumNarozeni;
	}

	public String getJmeno() {
		return jmeno;
	}

	public boolean isZijeVCesku() {
		return zijeVCesku;
	}
	
}
