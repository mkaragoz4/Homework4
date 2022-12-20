package hW4;

public class Ks1 {

	public static void main(String[] args) {

		/*
		 * String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” string
		 * ifadesini “Java ogrenmek cok guzel.” sekline getirin.
		 */

		String str = "Java ogrenmek123 Cok guzel@";
		// Tüm sayıları ve özel karakterleri kaldır
		str = str.replaceAll("[^a-zA-Z\\s]", "");
		// Tüm harfleri küçük harfe çevir
		str = str.toLowerCase();
		// İlk kelimeyi büyük harfe çevir
		str = str.substring(0, 1).toUpperCase() + str.substring(1);

		System.out.println(str);
	}

}
