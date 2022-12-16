package homework3;

import java.util.Scanner;

public class Question2 {
	
	public static void main (String[]args) {
		
		/*
		 * Kullanıcıdan bir gün girmesini isteyelim.
		 *  a. Eger girilen gun hafta sonu ise tekrar kontrol edelim Cumartesi ise Cumartesi ve hafta sonu, Pazar ise
		 * Pazar ve hafta sonu yazdıralım. 
		 *  b. Degil ise gün hafta ici yazdıralım.
		 *   1.* Note: equals ile karsilastiralim 
		 *   2. Nested ternary kullanalım…
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a day");
		
		String day=scan.nextLine();
		
		String str = day.equals("Saturday") || day.equals("Sunday") ? (day.equals("Saturday") ? "Saturday and Weekend" : "Sunday and weekend") :"in week";
		
		System.out.println("Situation is"+ str);
		
		scan.close();
		
		
	}

}
