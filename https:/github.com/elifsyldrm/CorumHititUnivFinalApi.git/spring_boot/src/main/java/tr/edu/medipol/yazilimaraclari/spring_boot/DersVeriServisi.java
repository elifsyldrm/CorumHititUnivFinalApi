package tr.edu.medipol.yazilimaraclari.spring_boot;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class DersVeriServisi {
	
	private static final List<Ders> DERSLER = new ArrayList<>();
	static {
		DERSLER.add(new Ders("Genel Matematik","101"));
		DERSLER.add(new Ders("Kullanıcı Arayüzü Tasarımları","102"));
		DERSLER.add(new Ders("Yazılım Geliştirme ve Ortam Araçları","103"));
		DERSLER.add(new Ders("Mobil Programlama","105"));
		DERSLER.add(new Ders("İleri Java","106"));
		DERSLER.add(new Ders("İngilizce","107"));
		DERSLER.add(new Ders("Programcılığa Giriş","108"));
	}
	
	public static List<Ders> dersleriGetir(){
		return DERSLER;
	}

	public static void dersEkle(Ders ders) {
		DERSLER.add(ders);
	}
	
    public static void dersSil(Ders ders) {
    		
    		Iterator<Ders> drs = DERSLER.iterator();
    		for (listIterator(); drs.hasNext();) {
    			if (ders.getIsim().equals(ders.getIsim())) {
    				drs.remove();
    				return; 
  				 }
 		  }
     }

	private static void listIterator() {
		return;
	
    }
}
					
				   				

	


	