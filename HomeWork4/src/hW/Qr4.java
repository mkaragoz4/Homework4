package hW;

public class Qr4 {
	
	import java.util.Scanner;

	public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Isminizi giriniz: ");
	    String isim = sc.nextLine();

	    System.out.print("Soyisminizi giriniz: ");
	    String soyisim = sc.nextLine();

	    System.out.print("Kredi kartı numaranızı giriniz: ");
	    String kartNo = sc.nextLine();

	    // İsim ve soyisimde ilk harfleri göster, geri kalanını gizle
	    String gizliIsim = isim.substring(0, 1) + "***";
	    String gizliSoyisim = soyisim.substring(0, 1) + "*****";

	    // Kredi kartı numarasında ilk 12 hanesini göster, son 4 haneyi gizle
	    String gizliKartNo = kartNo.substring(0, 12) + "****";

	    System.out.println("isim-soyisim : " + gizliIsim + " " + gizliSoyisim);
	    System.out.println("kart no : " + gizliKartNo);
	  }
	}

}
