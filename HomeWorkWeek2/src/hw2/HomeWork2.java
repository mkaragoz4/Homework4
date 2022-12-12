package hw2;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		// CREATE THREE STRING VARIABLES
		System.out.println("CREATE THREE STRING VARIABLES");

		System.out.println("M.Ferhat" + " " + "KARAGOZ" + "\nOslo/Norway");

		// MILE TO KILOMETER
		System.out.println("MILE TO KILOMETER");

		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a mile value:");
		int mile = (int) scan.nextDouble();

		double ratio = 1.6;
		double kılometer = ratio * mile;
		System.out.println(mile + " " + "mile is equel" + " " + kılometer + " " + "kilometer");

		// HOURS TO SECONDS
		System.out.println("HOURS TO SECONDS");

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please insert hour:");
		int hour = (int) scan2.nextLong();

		int second = hour * 3600;
		System.out.println(hour + " " + "hour is" + " " + second + " " + "seconds");

		// CALCULATING THE PERIMETER AND AREA OF A SQUARE
		System.out.println("CALCULATING THE PERIMETER AND AREA OF A SQUARE");

		Scanner scan3 = new Scanner(System.in);
		System.out.println("Please insert side lenght:");
		int side = scan3.nextInt();

		int perimeter = side * 4;
		System.out.println("Perimeter of the square is:" + " " + perimeter);

		int area = side * side;
		System.out.println("Area of the square is:" + " " + area);

		// THE VOLUME OF THE RECTANGULAR PRISM
		System.out.println("THE VOLUME OF THE RECTANGULAR PRISM");
		

		Scanner scan4 = new Scanner(System.in);
		System.out.println("Please insert long side");
		int long_side = scan4.nextInt();

		Scanner scan5 = new Scanner(System.in);
		System.out.println("Please insert short side");
		int short_side = scan5.nextInt();

		Scanner scan6 = new Scanner(System.in);
		System.out.println("Please insert height");
		int height = scan6.nextInt();

		int volume = long_side * short_side * height;
		System.out.println("The volume of rectangular prism is:" + " " + volume);

		// APPLICATION OF THE COURSE
		System.out.println("APPLICATION OF THE COURSE");

		Scanner scan11 = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = scan11.next();

		Scanner scan12 = new Scanner(System.in);
		System.out.println("Please enter your surname:");
		String surname = scan12.next();

		System.out.println("Name:" + name);
		System.out.println("Surname:" + surname);
		System.out.println("Your application is accepted!Thank you.");

	}

}
