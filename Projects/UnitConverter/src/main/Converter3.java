package main;

import java.util.Scanner;

public class Converter3 {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		Converter3 c = new Converter3();
		
		int menuSelection = 0;
		
		do {
			
			//prompt for unit type
			menuSelection = c.unitMenuPrompt();	
			
			switch(menuSelection) {
				case 1:{
					//Volume 
					c.volumeMenu();
					break;
				}
				case 2:{
					//Distance
					c.milesToKilometer();
					break;
				}
				case 3:{
					//Temperature
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
	
	
	
	private int unitMenuPrompt() {
		String[] promptMsg =  {"Please select an option:",
				"1. Volume",
				"2. Distance",
				"3. Temperature",
				"4. Quit"};
		
		for(String line: promptMsg) {
			System.out.println(line);
		}
		System.out.print("\nEnter selection: ");
		
		return userInput.nextInt();
	}
	
	private void volumeMenu() {
		String[] promptMsg1 =  {"Please select initial unit type:",
				"1. Cups",
				"2. Teaspoons",
				"3. US Gallons",
				"4. Imperial Gallons"};
		
		int selection1 = 0, selection2 = 0, selection3 = 0;
		
		for(String line: promptMsg1) {
			System.out.println(line);
		}
		System.out.print("\nEnter selection: ");
		selection1 = userInput.nextInt();
		String[] promptMsg2 = new String[4];
		promptMsg2[0]  = "Please select final unit type:";
		
		switch(selection1) {
			case 1:
				promptMsg2[1]  = "1. Teaspoons";
				promptMsg2[2]  = "2. US Gallons";
				promptMsg2[3]  = "3. Imperial Gallons";
				
				do {
					for(String line: promptMsg2) {
						System.out.println(line);
					}
					System.out.print("\nEnter selection: ");
					selection2 = userInput.nextInt();
				}while(selection2 > 3 | selection2 < 1);
					
		
				if(selection2 == 1) {
					cupsToTeaspoons();
				}
				else if(selection2 == 2) {
					cupsToUSGallons();
				}
				else {
					cupsToIGallons();
				}	
				break;
				
			case 2:
				promptMsg2[1]  = "1. Cups";
				promptMsg2[2]  = "2. US Gallons";
				promptMsg2[3]  = "3. Imperial Gallons";
	
				for(String line: promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				selection2 = userInput.nextInt();
				
		
				if(selection2 == 1) {
					cupsToTeaspoons();
				}
				else if(selection2 == 2) {
					cupsToUSGallons();
				}
				else {
					cupsToIGallons();
				}	
				break;
			case 3:
				promptMsg2[1]  = "1. Cups";
				promptMsg2[2]  = "2. Teaspoons";
				promptMsg2[3]  = "3. Imperial Gallons";
				for(String line: promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				selection2 = userInput.nextInt();
				
		
				if(selection2 == 1) {
					cupsToTeaspoons();
				}
				else if(selection2 == 2) {
					cupsToUSGallons();
				}
				else {
					cupsToIGallons();
				}	
				break;
			case 4:
				promptMsg2[1]  = "1. Cups";
				promptMsg2[2]  = "2. Teaspoons";
				promptMsg2[3]  = "3. US Gallons";
				for(String line: promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				selection2 = userInput.nextInt();
				
		
				if(selection2 == 1) {
					cupsToTeaspoons();
				}
				else if(selection2 == 2) {
					cupsToUSGallons();
				}
				else {
					cupsToIGallons();
				}	
				break;
			default:
				System.out.println("Invalid slection made.\n");
				volumeMenu();
				break;
			
		}
		
		
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
	

	private void milesToKilometer() {
		
		System.out.print("Enter the number of miles: ");
		double miles = userInput.nextDouble();
		
		double kilometer  = miles * 1.609344;
		System.out.println(miles + " miles equals " + kilometer + " kilometer.\n");
		
	}
	
	//Volume Conversion Methods
	//Cups to
	private void  cupsToTeaspoons() {
		System.out.print("Enter the number of cups: ");
		double cups = userInput.nextDouble();
		
		double teaspoons  = cups * 48;
		System.out.println(cups + " cups equals " + teaspoons + " teaspoons.\n");
	}
	
	private void  cupsToUSGallons() {
		System.out.print("Enter the number of cups: ");
		double cups = userInput.nextDouble();
		
		double gallons  = cups * 0.0625;
		System.out.println(cups + " cups equals " + gallons + " US gallons.\n");
	}
	
	private void  cupsToIGallons() {
		System.out.print("Enter the number of cups: ");
		double cups = userInput.nextDouble();
		
		double gallons  = cups * 0.05204197;
		System.out.println(cups + " cups equals " + gallons + " Imperial gallons.\n");
	}
	
	//Teaspoons to
	private void  teasspoonsToCups() {
		System.out.print("Enter the number of teaspoons: ");
		double teaspoons = userInput.nextDouble();
		
		double cups  = teaspoons * 0.02083333;
		System.out.println(teaspoons + " teaspoons equals " + cups + " cups.\n");
	}
	
	private void  teasspoonsToUSGallons() {
		System.out.print("Enter the number of teaspoons: ");
		double teaspoons = userInput.nextDouble();
		
		double gallons  = teaspoons * 0.001302083;
		System.out.println(teaspoons + " teaspoons equals " + gallons + " US gallons.\n");
	}
	
	private void  teasspoonsToIGallons() {
		System.out.print("Enter the number of teaspoons: ");
		double teaspoons = userInput.nextDouble();
		
		double gallons  = teaspoons * 0.001084208;
		System.out.println(teaspoons + " teaspoons equals " + gallons + " Imperial gallons.\n");
	}
	
	//US Gallons to
	private void  USGallonsToCups() {
		System.out.print("Enter the number of US gallons: ");
		double gallons = userInput.nextDouble();
		double cups  = gallons * 16;
		System.out.println(gallons + " US gallons equals " + cups + " cups.\n");
	}
	
	private void  USGallonsToTeaspoons() {
		System.out.print("Enter the number of US gallons: ");
		double gallons = userInput.nextDouble();
		double teaspoons  = gallons * 768;
		System.out.println(gallons + " US gallons equals " + teaspoons + " teaspoons.\n");
	}
	
	private void USGallonsToIGallons() {
		System.out.print("Enter the number of US gallons: ");
		double USGallons = userInput.nextDouble();
		double IGallons  = USGallons * 0.8326716;
		System.out.println(USGallons + " US gallons equals " + IGallons + " Imperial gallons.\n");
	}
}
