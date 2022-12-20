package hW4;

import java.util.Scanner;

public class Ks5 {
	
	public static void main (String[]args) {
		/*
		 * Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
		 * “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen
		 * yeni bir sifre girin” yazdirin
		 * 
		 * - Ilk harf buyuk harf olmali - Son harf kucuk harf olmali - Sifre bosluk
		 * icermemeli - Sifre uzunlugu en az 8 karakter olmali
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen şifrenizi giriniz");
		
		String sıfre=scan.nextLine();
		
		if (sıfre.length()<8) {
		System.out.println("Hatalı şifre");
		}
		else if (sıfre.contains("")) {
			System.out.println("Hatalı şifre");
		}
		else if (!Character.isUpperCase(sıfre.charAt(0))){    //çok karışık geldi burayı kopya çektim
			System.out.println("Hatalı şifre");
		}
		else if (!Character.isLowerCase(sıfre.charAt(sıfre.length() - 1))){ //burayı da
			System.out.println("Hatalı şifre");
		}
		else{
			System.out.println("Şifre başarılı");
		}
		
	
		
	}

}
