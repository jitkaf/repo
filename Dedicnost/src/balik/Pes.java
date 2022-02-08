package balik;

import java.time.LocalDate;

import java.time.LocalDate;


public class Pes extends Savec {

	public Pes(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku, double telesnaTeplota) {
		super(datumNarozeni, jmeno, zijeVCesku, telesnaTeplota);
	}
	
	@Override
	public void vypisInformace() {
		System.out.println("Jsem pes");
	}

}
