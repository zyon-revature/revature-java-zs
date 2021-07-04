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
					c.distanceMenu();
					break;
				}
				case 3:{
					//Temperature
					//c.USGallonsToIGallons();
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
	
	
	//menus
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
		
		do {
			for(String line: promptMsg1) {
				System.out.println(line);
			}
			System.out.print("\nEnter selection: ");
			selection1 = userInput.nextInt();
		}while(selection1 > 3 | selection1 < 1);
		
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
	
				do {
					for(String line: promptMsg2) {
						System.out.println(line);
					}
					System.out.print("\nEnter selection: ");
					selection2 = userInput.nextInt();
				}while(selection2 > 3 | selection2 < 1);
		
				if(selection2 == 1) {
					teasspoonsToCups();
				}
				else if(selection2 == 2) {
					teasspoonsToUSGallons();
				}
				else {
					teasspoonsToIGallons();
				}	
				break;
			case 3:
				promptMsg2[1]  = "1. Cups";
				promptMsg2[2]  = "2. Teaspoons";
				promptMsg2[3]  = "3. Imperial Gallons";
				
				do {
					for(String line: promptMsg2) {
						System.out.println(line);
					}
					System.out.print("\nEnter selection: ");
					selection2 = userInput.nextInt();
				}while(selection2 > 3 | selection2 < 1);
				
				if(selection2 == 1) {
					USGallonsToCups();
				}
				else if(selection2 == 2) {
					USGallonsToTeaspoons();
				}
				else {
					USGallonsToIGallons();
				}	
				break;
			case 4:
				promptMsg2[1]  = "1. Cups";
				promptMsg2[2]  = "2. Teaspoons";
				promptMsg2[3]  = "3. US Gallons";
				
				do {
					for(String line: promptMsg2) {
						System.out.println(line);
					}
					System.out.print("\nEnter selection: ");
					selection2 = userInput.nextInt();
				}while(selection2 > 3 | selection2 < 1);
		
				if(selection2 == 1) {
					IGallonsToCups();
				}
				else if(selection2 == 2) {
					IGallonsToTeaspoons();
				}
				else {
					IGallonsToUSGallons();
				}	
				break;
			default:
				System.out.println("Invalid slection made.\n");
				volumeMenu();
				break;
			
		}
		
		
	}
	
	private void distanceMenu() {
		String[] promptMsg1 =  {"Please select initial unit type:",
				"1. Feet",
				"2. Miles",
				"3. Kilometers",
				"4. Nautical Miles"};
		
		int selection1 = 0, selection2 = 0, selection3 = 0;
		
		do {
			for(String line: promptMsg1) {
				System.out.println(line);
			}
			System.out.print("\nEnter selection: ");
			selection1 = userInput.nextInt();
		}while(selection1 > 3 | selection1 < 1);
		
		String[] promptMsg2 = new String[4];
		promptMsg2[0]  = "Please select final unit type:";
		
		switch(selection1) {
			case 1:
				promptMsg2[1]  = "1. Miles";
				promptMsg2[2]  = "2. Kilometers";
				promptMsg2[3]  = "3. Nautical Miles";
				
				do {
					for(String line: promptMsg2) {
						System.out.println(line);
					}
					System.out.print("\nEnter selection: ");
					selection2 = userInput.nextInt();
				}while(selection2 > 3 | selection2 < 1);
		
				if(selection2 == 1) {
					feetToMiles();
				}
				else if(selection2 == 2) {
					feetToKilometers();
				}
				else {
					feetToNauticalMiles();
				}	
				break;
				
			case 2:
				promptMsg2[1]  = "1. Feet";
				promptMsg2[2]  = "2. Kilometers";
				promptMsg2[3]  = "3. Nautical Miles";
	
				do {
					for(String line: promptMsg2) {
						System.out.println(line);
					}
					System.out.print("\nEnter selection: ");
					selection2 = userInput.nextInt();
				}while(selection2 > 3 | selection2 < 1);
		
				if(selection2 == 1) {
					milesToFeet();
				}
				else if(selection2 == 2) {
					milesToKilometers();
				}
				else {
					milesToNauticalMiles();
				}	
				break;
			case 3:
				promptMsg2[1]  = "1. Miles";
				promptMsg2[2]  = "2. Feet";
				promptMsg2[3]  = "3. Nautical Miles";
				
				do {
					for(String line: promptMsg2) {
						System.out.println(line);
					}
					System.out.print("\nEnter selection: ");
					selection2 = userInput.nextInt();
				}while(selection2 > 3 | selection2 < 1);
				
				if(selection2 == 1) {
					kilometersToMiles();
				}
				else if(selection2 == 2) {
					kilometersToFeet();
				}
				else {
					kilometersToNauticalMiles();
				}	
				break;
			case 4:
				promptMsg2[1]  = "1. Miles";
				promptMsg2[2]  = "2. Kilometers";
				promptMsg2[3]  = "3. Feet";
				
				do {
					for(String line: promptMsg2) {
						System.out.println(line);
					}
					System.out.print("\nEnter selection: ");
					selection2 = userInput.nextInt();
				}while(selection2 > 3 | selection2 < 1);
		
				if(selection2 == 1) {
					nauticalMilesToMiles();
				}
				else if(selection2 == 2) {
					nauticalMilesToKilometers();
				}
				else {
					nauticalMilesToFeet();
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
	
	//Imperial Gallons to
	private void  IGallonsToCups() {
		System.out.print("Enter the number of Imperial gallons: ");
		double gallons = userInput.nextDouble();
		double cups  = gallons * 19.21526;
		System.out.println(gallons + " Imperial gallons equals " + cups + " cups.\n");
	}
	
	private void  IGallonsToTeaspoons() {
		System.out.print("Enter the number of Imperial gallons: ");
		double gallons = userInput.nextDouble();
		double teaspoons  = gallons * 922.3324;
		System.out.println(gallons + " Imperial gallons equals " + teaspoons + " teaspoons.\n");
	}
	
	private void IGallonsToUSGallons() {
			System.out.print("Enter the number of Imperial gallons: ");
			double IGallons = userInput.nextDouble();
			double USGallons  = IGallons * 1.200954;
			System.out.println(IGallons + " Imperial gallons equals " + USGallons + " US gallons.\n");
	}

	//Distance
	//miles to
	private void  milesToFeet() {
		System.out.print("Enter the number of miles: ");
		double miles = userInput.nextDouble();
		double feet  = miles * 5280;
		System.out.println(feet + " miles equals " + feet + " feet.\n");
	}
	
	private void  milesToKilometers() {
		System.out.print("Enter the number of miles: ");
		double miles = userInput.nextDouble();
		double km  = miles * 1.609344;
		System.out.println(miles + " miles equals " + km + " kilometers.\n");
	}
	
	private void milesToNauticalMiles() {
			System.out.print("Enter the number of miles: ");
			double miles = userInput.nextDouble();
			double nmiles  = miles * 0.8689758;
			System.out.println(miles + " miles equals " + nmiles + " nautical miles.\n");
	}
	
	//kilometers to
	private void  kilometersToFeet() {
		System.out.print("Enter the number of kilometers: ");
		double kilometers = userInput.nextDouble();
		double feet  = kilometers * 3280.84;
		System.out.println(kilometers + " kilometers equals " + feet + " feet.\n");
	}
	
	private void  kilometersToMiles() {
		System.out.print("Enter the number of kilometers: ");
		double kilometers = userInput.nextDouble();
		double miles  = kilometers * 0.6213712;
		System.out.println(kilometers + " kilometers equals " + miles + " kilometers.\n");
	}
	
	private void kilometersToNauticalMiles() {
			System.out.print("Enter the number of kilometers: ");
			double kilometers = userInput.nextDouble();
			double nmiles  = kilometers * 0.5399565;
			System.out.println(kilometers + " kilometers equals " + nmiles + " nautical miles.\n");
	}
	
	//nautical mile to
	private void  nauticalMilesToMiles() {
		System.out.print("Enter the number of feet: ");
		double nmiles = userInput.nextDouble();
		double miles  = nmiles * 1.15078;
		System.out.println(nmiles + " nautical miles equals " + miles + " miles.\n");
	}
	
	private void  nauticalMilesToKilometers() {
		System.out.print("Enter the number of feet: ");
		double nmiles = userInput.nextDouble();
		double km  = nmiles * 1.852001;
		System.out.println(nmiles + " nautical miles equals " + km + " kilometers.\n");
	}
	
	private void nauticalMilesToFeet() {
			System.out.print("Enter the number of feet: ");
			double nmiles = userInput.nextDouble();
			double feet  = nmiles * 6076.118 ;
			System.out.println(nmiles + " nautical miles equals " + feet + " feet.\n");
	}
	
	//feet to
	private void  feetToMiles() {
		System.out.print("Enter the number of feet: ");
		double feet = userInput.nextDouble();
		double miles  = feet * 0.0001893939;
		System.out.println(feet + " feet equals " + miles + " miles.\n");
	}
	
	private void  feetToKilometers() {
		System.out.print("Enter the number of feet: ");
		double feet = userInput.nextDouble();
		double km  = feet * 0.0003048;
		System.out.println(feet + " feet equals " + km + " kilometers.\n");
	}
	
	private void feetToNauticalMiles() {
			System.out.print("Enter the number of feet: ");
			double feet = userInput.nextDouble();
			double nmiles  = feet * 0.0001645788;
			System.out.println(feet + " feet equals " + nmiles + " nautical miles.\n");
	}
	//Temperature





}
