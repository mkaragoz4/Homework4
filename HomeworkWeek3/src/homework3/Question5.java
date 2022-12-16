package homework3;

import java.util.Scanner;

public class Question5 {
	
	public static void main(String[]args) {
		
		/*
		 * Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf
		 * olup olmadigini yazdirin. (D, d, 3, ~, @, !, ...) (ip ucu: ascii tablosu)
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("karakter giriniz");
		char charac=scan.next().charAt(0);
		
		
		int  ascii= charac;
		
		if((ascii >= 65) && (ascii <= 90) || ((ascii >=97 ) && (ascii <= 122)))
			
			System.out.println("karakter harftir");
		else
			System.out.println("karakter harf değildir");
		
		
	}

	
		
	}
	
