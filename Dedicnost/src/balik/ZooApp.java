package balik;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZooApp {

	public static void main(String[] args) {
		LocalDate datumNarozeníZvirete = LocalDate.of(2001, 12,11);//vytvoøení datumu 11.12.2001
		LocalDate datumNarozeniKrokodyla = LocalDate.of(2020, 2,1);//vytvoøení datumu 11.12.2001
		
		
		//vytvoøení instancí všech tøíd 
		Zvire z = new Zvire(datumNarozeníZvirete, "Zvire", false);
		Savec s = new Savec(LocalDate.of(2021, 12,10), "Savec", true, 28);
		Plaz p = new Plaz(LocalDate.of(2022, 1,10), "Simon", true);
		Had had = new Had(LocalDate.of(2015, 12,10), "Karolina", true);
		Krokodyl krokodyl = new Krokodyl(datumNarozeniKrokodyla, "Ivan", false);
		Zelva zelva = new Zelva(LocalDate.of(2011, 1,1), "Zelda", true);
		Medved medved = new Medved(LocalDate.of(2013, 12,10), "Brum", true, 35.5);
		Pes pes = new Pes(LocalDate.of(2014, 12,10), "Azor", true, 28.2);
		
		//volání výpisu informací - pozor do ted nebyly nastaveny èasy krmení
		z.vypisInformace();
		s.vypisInformace();
		p.vypisInformace();
		had.vypisInformace();
		krokodyl.vypisInformace();
		zelva.vypisInformace();
		medved.vypisInformace();
		
		
		//vytvoøení ArrayListu s hodinama krmení
		List<Integer> hodinyKrmeniHada = new ArrayList<Integer>();
		hodinyKrmeniHada.add(15);
		hodinyKrmeniHada.add(11);

		had.setHodinyKrmeni(hodinyKrmeniHada); //nastavení hodin krmení hadovi
		had.setPocetKrmeniZaDen(2);
		
		//vytvoøení ArrayListu s hodinama krmení
		List<Integer> hodinyKrmeniPsa= new ArrayList<Integer>();
		hodinyKrmeniPsa.add(1);
		hodinyKrmeniPsa.add(10);
		pes.setHodinyKrmeni(hodinyKrmeniPsa); //nastaveni hodin krmení psovi
		
		//vytvoøení ArrayListu s hodinama krmení
		List<Integer> hodinyKrmeniMedveda = new ArrayList<Integer>();
		hodinyKrmeniMedveda.add(1);
		hodinyKrmeniMedveda.add(6);
		hodinyKrmeniMedveda.add(8);
		hodinyKrmeniMedveda.add(16);
		medved.setHodinyKrmeni(hodinyKrmeniMedveda); //nastaveni hodin krmení medvedovi
		
		System.out.println("------------------------------------------");
		//vypsáni informací instance psa a hada - po nastevení hodin krmení
		had.vypisInformace();
		pes.vypisInformace();
		medved.vypisInformace();
	}

}
