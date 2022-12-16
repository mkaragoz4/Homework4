package homework3;

import java.util.Scanner;

public class Question4 {
	
	public static void main (String[]args) {
		
		
		/*
		 * 4- Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin
		 * kutsal gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun”
		 * yazdirin. “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin.
		 * (switch case default ile yapalim)
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a day");
		String day=scan.nextLine();
		switch (day) {
		case "cuma" :
			System.out.println("Müslümanlar icin kutsal gun");
			break;
		case "cumartesi":
			System.out.println("Yahudiler icin kutsal gun");
			break;
		case "pazar":
			System.out.println("Hristiyanlar icin kutsal gun");
			break;
		default:
			System.out.println("Bize her gün bayram");
			
		
		
		}
		
		scan.close();
		
		
		
		
		
	}
	

}
