package main;

import java.util.Scanner;

public class Converter2 {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		Converter2 c = new Converter2();
		
		int menuSelection = 0;
		
		do {
			
			//prompt
			c.menuPrompt();
			
			//User enter inputs into menuSelection
			menuSelection = userInput.nextInt();	
			
			switch(menuSelection) {
				case 1:{
					c.cupsToTeaspoons();
					break;
				}
				case 2:{
					c.milesToKilometer();
					break;
				}
				case 3:{
					c.USGallonsToIGallons();
					break;
				}
				case 4:{
					System.out.println("Goodbye!");
					break;
				}
				default:{
					System.out.println("Invalid number entered.\n");
					break;
				}
			}
		
		}while(menuSelection != 4);
		
		userInput.close();
		

	}
	
	private void USGallonsToIGallons() {
		System.out.println("Enter the number of US gallons: ");
		double USGallons = userInput.nextDouble();
		double IGallons  = USGallons * 0.8326716;
		System.out.println(USGallons + " US gallons equals " + IGallons + " Imperial gallons.\n");
		
	}

	private void milesToKilometer() {
		
		System.out.println("Enter the number of miles: ");
		double miles = userInput.nextDouble();
		
		double kilometer  = miles * 1.609344;
		System.out.println(miles + " miles equals " + kilometer + " kilometer.\n");
		
	}

	private void menuPrompt() {
		String[] promptMsg =  {"Please select an option:",
				"1. Cups to Teaspoons",
				"2. Miles to Kilometers",
				"3. US Gallons to Imperial Gallons",
				"4. Quit"};
		
		for(String line: promptMsg) {
			System.out.println(line);
		}
		System.out.print("\nEnter selection: ");
		
	}
	
	private void  cupsToTeaspoons() {
		System.out.println("Enter the number of cups: ");
		double cups = userInput.nextDouble();
		
		double teaspoons  = cups * 48;
		System.out.println(cups + " cups equals " + teaspoons + " teaspoons.\n");
	}
}
