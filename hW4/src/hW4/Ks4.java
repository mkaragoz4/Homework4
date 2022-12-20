package hW4;

import java.util.Scanner;

public class Ks4 {
	
	public static void main(String[]args) {
		/*
		 * Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki
		 * gibi yazdirin.
		 * 
		 * isim-soyisim : O*** K***** kart no : **** **** **** 1234
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Isminizi Giriniz:");
		String isim=scan.nextLine();
		System.out.println("Soyisim");
		String soyisim=scan.nextLine();
		System.out.println("Kart numarasini giriniz:");
		String kartno=scan.nextLine();
		
		String yeniisim=isim.substring(0,1)+"*****";
		String yenisoyisim=soyisim.substring(0,1)+"*****";
		
		String yenikart=kartno.substring(0,12)+"********";
		
		System.out.println("Adiniz:" + yeniisim + "Soyadiniz:"+ yenisoyisim);
		System.out.println("Kart numaraniz:"+ yenikart);
	
		
		
	}
	

}
