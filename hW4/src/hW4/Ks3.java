package hW4;

import java.util.Scanner;

public class Ks3 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu
		 * yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz:");
		String isim = scan.nextLine();

		System.out.println("Lütfen soyisminizi giriniz:");
		String soyisim = scan.nextLine();

		if (isim.length() > soyisim.length()) {
			System.out.println("İsminiz daha uzun");
		} else if (isim.length() < soyisim.length()) {
			System.out.println("Soyisminiz daha uzun");
		} else {
			System.out.println("İsminiz ve soyisminiz eşit uzunlukta");
		}

	}

}
