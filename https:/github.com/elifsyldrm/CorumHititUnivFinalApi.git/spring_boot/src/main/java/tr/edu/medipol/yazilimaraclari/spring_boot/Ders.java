package tr.edu.medipol.yazilimaraclari.spring_boot;

public class Ders {
	private String isim;
	private String dersNo;
	public Ders(String isim, String dersNo) {
		super();
		this.isim = isim;
		this.dersNo = dersNo;
	}
	public String getIsim() {
		return isim;
	}
	public String getDersNo() {
		return dersNo;
	}

	}


