package homework3;

import java.util.Scanner;

public class Question1 {
	
	public static void main (String[]args) {
		
		
		//Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan java kodunu yazalım.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		
		int number1=scan.nextInt();
		
		System.out.println("Please enter second number");
		
		int number2=scan.nextInt();
		
		System.out.println("Please enter third number");
		
		int number3=scan.nextInt();
		
		
		if (number1>= number2 && number1 >= number3 )
			
			System.out.println("Bigeest number is" +" "+ number1);
		
		else if (number2 >= number1 && number2>=number3)
			
			System.out.println("Bigeest number is"+" " +number2);
		
		else
			
			System.out.println("Biggest number is" + " "+number3);
		
			
		
		
	}

}
