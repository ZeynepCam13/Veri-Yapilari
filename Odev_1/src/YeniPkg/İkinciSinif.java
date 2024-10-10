package YeniPkg;

public class İkinciSinif {
	/*private String ad;
	private String soyad;
	private int OkulNo;

	public İkinciSinif(String ad,String soyad,int OkulNo) {
		this.ad=ad;
		this.soyad=soyad;
		this.OkulNo=OkulNo;
	}
	public İkinciSinif() {
		
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd() {
		this.ad=ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad() {
		this.soyad=soyad;
	}
	public int getOkulNo() {
		return OkulNo;
	}
	public void setOkulNo() {
		this.OkulNo=OkulNo;
	}
	*/
	 private String ad;
	    private String soyad;
	    private int OkulNo;

	    // Yapıcı metotlar
	    public İkinciSinif(String ad, String soyad, int OkulNo) {
	        this.ad = ad;
	        this.soyad = soyad;
	        this.OkulNo = OkulNo;
	    }

	    public İkinciSinif() {}

	    // Getter ve Setter metotları
	    public String getAd() {
	        return ad;
	    }

	    public void setAd(String ad) {
	        this.ad = ad;
	    }

	    public String getSoyad() {
	        return soyad;
	    }

	    public void setSoyad(String soyad) {
	        this.soyad = soyad;
	    }

	    public int getOkulNo() {
	        return OkulNo;
	    }

	    public void setOkulNo(int OkulNo) {
	        this.OkulNo = OkulNo;
	    }

	    // Değer yazdırma metodu
	    public static void İkinciSinifDegerYazdir(İkinciSinif iks) {
	        System.out.println("İsim: " + iks.getAd());
	        System.out.println("Soyad: " + iks.getSoyad());
	        System.out.println("Okul No: " + iks.getOkulNo());
	    }

		public void ikinciSinifDegerYazdir() {
			// TODO Auto-generated method stub
			
		}


}
