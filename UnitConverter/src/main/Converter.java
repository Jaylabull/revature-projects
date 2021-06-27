package main;

import java.util.Scanner;

public class Converter {
	static Scanner newScan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int menuSelection = 0;
		
		do {
			System.out.println("1. Ounces to Cups");
			System.out.println("2. Feet to Meters");
			System.out.println("3. Miles to Kilometers");
			System.out.println("4.Quit");
		}
		while(menuSelection != 0 );
		

		System.out.println("What would you like to convert?");
		String userSelection = newScan.nextLine();
		
		
		
		switch(userSelection) {
		case "1":
			System.out.println("You selected Ounces to Cups");
			System.out.println("Enter number to convert: ");
			ounceToCup();
			break;
		case "2":
			System.out.println("You selected Feet to Meters");
			System.out.println("Enter number to convert: ");
			feetToMeters();
			break;
		case "3":
			System.out.println("You selected Miles to Kilometers");
			System.out.println("Enter number to convert: ");
			milesToKilometers();
			break;
		default:
			System.out.println("This is not an option.");
			break;
		}//End Do-while loop
			
		
	}//End Main
	
	public static void ounceToCup() {
		Scanner scanDbl = new Scanner(System.in);
		double userDbl = scanDbl.nextDouble();
		System.out.print(userDbl/8);
	
	}
	
	public static void feetToMeters() {
		Scanner scanDbl = new Scanner(System.in);
		double userDbl = scanDbl.nextDouble();
		System.out.print(userDbl/3.281);
	
	}
	
	public static void milesToKilometers() {
		Scanner scanDbl = new Scanner(System.in);
		double userDbl = scanDbl.nextDouble();
		System.out.print(userDbl * 1.609);
	
	}
	
}//End Converter Class
