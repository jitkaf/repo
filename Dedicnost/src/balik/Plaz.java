package balik;

import java.time.LocalDate;


public class Plaz extends Zvire {

	private final boolean TEPLOKREVNOST = false;
	
	
	public Plaz(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		super(datumNarozeni, jmeno, zijeVCesku);
		
	}
	@Override
	public void vypisInformace() {
		System.out.println("Datum narozeni je " + getDatumNarozeni() + " jedna se o studenoktevneho plaza. ");
	}
}
