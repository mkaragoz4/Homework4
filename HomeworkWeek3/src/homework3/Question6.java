package homework3;

import java.util.Scanner;

public class Question6 {
	
	public static void main (String[]args) {
		
		/*
		 * 6- Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip
		 * yazdirin. 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin
		 * uzerinde ise “A”.(If, else if, else kullanalim)
		 */
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen notunuzu giriniz:");
	int not=scan.nextInt();
	
	if (not < 50) {
		System.out.println("D");
	}
	else if (50<not  && not <60) {
		System.out.println("C");
	}	
	else if (60<not && not<80) {
		System.out.println("B");
	}	
		
	else {
		System.out.println("A");
	}
	scan.close();
	}
	
		
		
		
	}
	

