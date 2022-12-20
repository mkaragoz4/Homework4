package hW;

public class Qr2 {
	
	import java.util.Scanner;

	public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Isminizi giriniz: ");
	    String isim = sc.nextLine();

	    if (isim.contains("a")) {
	      System.out.println("Girdiginiz isim a harfi iceriyor.");
	    } else if (isim.contains("Z")) {
	      System.out.println("Girdiginiz isim Z harfi iceriyor.");
	    } else {
	      System.out.println("Girdiginiz isim a veya Z harfi icermiyor.");
	    }
	  }
	}

}
