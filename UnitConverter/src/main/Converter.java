package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		int menuSelection = 0;
		
		do {
			System.out.println("1. Ounces to Cups");
			System.out.println("2. Feet to Meters");
			System.out.println("3. Miles to Kilometers");
			System.out.println("4.Quit");
		}
		while(menuSelection != 0 );
		
		Scanner newScan = new Scanner(System.in);
		System.out.println("What would you like to convert?");
		String userSelection = newScan.nextLine();
		
		
		
		switch(userSelection) {
		case "1":
			System.out.println("You selected Ounces to Cups");
			break;
		case "2":
			System.out.println("You selected Feet to Meters");
			break;
		case "3":
			System.out.println("You selected Miles to Kilometers");
			break;
		default:
			System.out.println("This is not an option.");
			break;
		}//End While do loop
		
		System.out.println("Please enter what you would like to convert: ");
			
		
	}//End Main
	
}//End Converter Class
