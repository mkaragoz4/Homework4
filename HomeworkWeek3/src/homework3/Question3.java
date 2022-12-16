package homework3;

import java.util.Scanner;

public class Question3 {
	
	public static void main (String[] args) {
		
		/*
		 * 3- Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
		 * baslayan gun isimlerini yazdirin. Ornek ilkHarf=P output = “Pazar, Pazartesi
		 * veya Persembe” ilkHarf=S output = “Sali” (switch case default ile yapalim)
		 */
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Please enter a letter");
		
		char letter=scan.next().charAt(0);
		
		switch (letter) {
		
		case 'p' :
			
			System.out.println("Pazartesi, Perşeme, Pazar");
			break;
		case 's' :
			
			System.out.println("Sali");
			break;
		case 'ç' :
			System.out.println("Çarşamba");
			break;
		case 'c' :
			System.out.println("Cuma, cumartesi");
			break;
			
		default :
			System.out.println("Lütfen başka bir harf deneyiniz");
				
		
		}
		
		scan.close();
			
		
	}

}
