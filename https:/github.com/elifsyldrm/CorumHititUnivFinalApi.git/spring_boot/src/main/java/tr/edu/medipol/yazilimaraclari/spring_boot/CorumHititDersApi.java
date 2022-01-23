package tr.edu.medipol.yazilimaraclari.spring_boot;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ders")
public class CorumHititDersApi {
	
	/**
	 * http://localhost:8080/ogrenci/listele 
	 */
	@GetMapping("/listele")
	public List<Ders> listele() {
		return DersVeriServisi.dersleriGetir();
	}
	
	@PostMapping("/ekle")
	public Ders ekle(@RequestBody Ders ders ) {
		DersVeriServisi.dersEkle(ders);
		return ders;
	}
	
	@GetMapping("/ekle2")
	public Ders dersEkle(
			@RequestParam String isim,
			@RequestParam String dersNo) {
		Ders ders = new Ders(isim, dersNo);
		DersVeriServisi.dersEkle(ders);
		return ders;
		
	}
	
	@DeleteMapping("/sil")
	public static Ders dersSil(@RequestBody Ders ders) {
		DersVeriServisi.dersSil(ders);
		return ders;

}
}
