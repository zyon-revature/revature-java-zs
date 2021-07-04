package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		Converter c = new Converter();
		
		int menuSelection = 1;
		
		Scanner userInput = new Scanner(System.in);
		
		
		do {
			
			//prompt
			c.menuPrompt();
			
			
			//User enter inputs into menuSelection
			menuSelection = userInput.nextInt();	
			
			
			switch(menuSelection) {
				case 1:{
					System.out.println("Enter the number of cups: ");
					double cups = userInput.nextDouble();
					c.cupsToTeaspoons(cups);
					break;
				}
				case 2:{
					System.out.println("Enter the number of miles: ");
					double miles = userInput.nextDouble();
					c.milesToKilometer(miles);
					break;
				}
				case 3:{
					System.out.println("Enter the number of US gallons: ");
					double USGallons = userInput.nextDouble();
					c.USGallonsToIGallons(USGallons);
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
	
	private void USGallonsToIGallons(double value) {
		double IGallons  = value * 0.8326716;
		System.out.println(value + " US gallons equals " + IGallons + " Imperial gallons.\n");
		
	}

	private void milesToKilometer(double value) {
		double kilometer  = value * 1.609344;
		System.out.println(value + " miles equals " + kilometer + " kilometer.\n");
		
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
	
	private void  cupsToTeaspoons(double value) {
		double teaspoons  = value * 48;
		System.out.println(value + " cups equals " + teaspoons + " teaspoons.\n");
	}
	

	
	
	
}
