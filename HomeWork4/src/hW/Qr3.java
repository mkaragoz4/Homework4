package hW;

public class Qr3 {
	
	
	import java.util.Scanner;

	public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Isminizi giriniz: ");
	    String isim = sc.nextLine();

	    System.out.print("Soyisminizi giriniz: ");
	    String soyisim = sc.nextLine();

	    if (isim.length() > soyisim.length()) {
	      System.out.println("Isminiz daha uzun.");
	    } else if (soyisim.length() > isim.length()) {
	      System.out.println("Soyisminiz daha uzun.");
	    } else {
	      System.out.println("Isminiz ve soyisminiz eşit uzunlukta.");
	    }
	  }
	}

}
