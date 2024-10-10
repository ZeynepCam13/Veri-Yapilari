package YeniPkg;

import java.util.Scanner;

//3. 
public class AnaSinif {
	//4
	String ad;
	static String soyad;
	static int OkulNo;
	int TC;
	//5
	public AnaSinif() {
		String ad;
		String soyad;
		int OkulNo;
		int TC;
		
	}
	public AnaSinif(String ad,String soyad) {
		this.ad="Zeynep";
		this.soyad="Çam";
		this.TC=520256;
		this.OkulNo=52335;
	}
	public AnaSinif(int OkulNo,int TC,String ad) {
		this.OkulNo=OkulNo;
		this.TC=TC;
		this.ad=ad;
	}
	public static void Yazdır() {
		int a=5;
		System.out.println("Yazdırılan Sayı: "+a);
	}
	
	public static void ikinciSinifaDegerAta(String ad,String soyad,int OkulNo) {
		İkinciSinif iks=new İkinciSinif();
		iks.setAd("zeynep");
		iks.setSoyad("çam");
		iks.setOkulNo(10);
		}
	
	
  
	public static void İkinciSinifDegerYazdir(İkinciSinif iks) {
        System.out.println("İsim: " + iks.getAd());
        System.out.println("Soyad: " + iks.getSoyad());
        System.out.println("OkulNo: " + iks.getOkulNo());}
    
	public static void main(String[] args) {
		İkinciSinif iks=new İkinciSinif();
		
		iks.setAd("zeynep");
		iks.setSoyad("çam");
		iks.setOkulNo(13);
		System.out.println("Ad: "+ iks.getAd());
		System.out.println("Soyad: "+ iks.getSoyad());
		System.out.println("Okul No: "+ iks.getOkulNo());
		
		AnaSinif.İkinciSinifDegerYazdir(iks);
		
		AnaSinif.Yazdır();
		
        Scanner scanner = new Scanner(System.in);
        İkinciSinif[] dizi = new İkinciSinif[10];

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". İsimi giriniz: ");
            String ad = scanner.nextLine();
          

            System.out.println((i + 1) + ". Soyisimi giriniz: ");
            String soyad = scanner.nextLine();
          

            System.out.println((i + 1) + ". Okul No'yu giriniz: ");
            int okulNo = scanner.nextInt();
            

            scanner.nextLine();  

            
            dizi[i] = new İkinciSinif(ad, soyad, okulNo);
        }


        System.out.println("------ ÖĞRENCİ BİLGİLERİ-------");
        for (int i = 0; i < 10; i++) {
            
            System.out.println((i+1)+". öğrenci İsim: " + dizi[i].getAd());  
            System.out.println((i+1)+". öğrenci Soyisim: " + dizi[i].getSoyad());  
            System.out.println((i+1)+". öğrenci Okul No: " + dizi[i].getOkulNo());  
            dizi[i].ikinciSinifDegerYazdir();
        }


        scanner.close();
	}
}



	




	


		
		
		
		
	




