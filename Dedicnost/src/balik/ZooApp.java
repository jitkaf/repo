package balik;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZooApp {

	public static void main(String[] args) {
		LocalDate datumNarozen� = LocalDate.of(2001, 12,11);
		
		//obecn�
		Zvire z = new Zvire(datumNarozen�, "Zvire", false);
		z.vypisInformace();
		
		Savec s = new Savec(LocalDate.of(2021, 12,10), "Savec", true, 28);
		s.vypisInformace();
		s.vydejZvuk("Mrk");
		
		Plaz p = new Plaz(LocalDate.of(2022, 1,10), "Simon", true);
		p.vypisInformace();
		
		//plazi
		List<Integer> hodinyKrmeniHada = new ArrayList<Integer>();
		hodinyKrmeniHada.add(15);
		hodinyKrmeniHada.add(11);
		
		
		Had had = new Had(LocalDate.of(2015, 12,10), "Karolina", true);
		had.setHodinyKrmeni(hodinyKrmeniHada);
		had.setPocetKrmeniZaDen(2);
		had.vypisInformace();
		
		Krokodyl krokodyl = new Krokodyl(datumNarozen�, "Ivan", false);
		krokodyl.vypisInformace();
		
		Zelva zelva = new Zelva(datumNarozen�, "Zelda", true);
		zelva.vypisInformace();
		
		//savci
		Medved medved = new Medved(datumNarozen�, "Brum", true, 35.5);
		medved.vypisInformace();
		
		Pes pes = new Pes(datumNarozen�, "Azor", true, 28.2);
		List<Integer> hodinyKrmeniPsa= new ArrayList<Integer>();
		hodinyKrmeniPsa.add(1);
		hodinyKrmeniPsa.add(10);
		pes.setHodinyKrmeni(hodinyKrmeniPsa);
		pes.vypisInformace();
	}

}
