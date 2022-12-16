package homework3;

import java.util.Scanner;

public class Question7 {
	
	public static void main(String[]arges) {
		/*
		 * 7- Kullanıcıdan 4 basamakli birsayi girmesini isteyin. Girdiği sayi 5’e
		 * bölünüyorsa son rakamını control edin. Sonrakamı 0 ise ekrana “5’e bölünen
		 * çift sayı” yazdırın. Sonrakamı 0değilise “5’e bölünen tek sayı” yazdırın.
		 * Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın. (Nested
		 * Ternary kullanalim)
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dört basamaklı sayı giriniz:");
		int sayı=scan.nextInt();
		
		String acıklama=(sayı %5 ==0) ? (sayı %10==0 ? "5 e bölünebilen çift sayı" : "5 e bölünebilen tek sayı") : "Tekrar deneyin";
		System.out.println(acıklama);
		
		
		
		
		
		
		
		
		
	}

}
