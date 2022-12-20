package hW;

public class Qr5 {
	
	import java.util.Scanner;


	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Lütfen bir şifre girin: ");
	String password = scanner.nextLine();
	
	
	if (isValidPassword(password)) {
		  System.out.println("Şifre başarıyla tanımlandı");
		} else {
		  System.out.println("İşlem başarısız, lütfen yeni bir şifre girin");
		}
	}

	public static boolean isValidPassword(String password) {
	if (password.length() < 8) {
	
	}
	if (password.contains(" ")) {
	
	}
	if (!Character.isUpperCase(password.charAt(0))) {
	
	}
	if (!Character.isLowerCase(password.charAt(password.length() - 1))) {
	
	}
	
	}
	}


