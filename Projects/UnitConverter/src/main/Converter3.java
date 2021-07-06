package main;

import java.util.Scanner;

public class Converter3 {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		Converter3 c = new Converter3();

		int menuSelection;

		do {

			// prompt for unit type
			menuSelection = c.unitMenuPrompt();

			switch (menuSelection) {
			case 1: {
				// Volume
				c.volumeMenu();
				break;
			}
			case 2: {
				// Distance
				c.distanceMenu();
				break;
			}
			case 3: {
				// Temperature
				c.temperatureMenu();
				break;
			}
			case 4: {
				System.out.println("Goodbye!");
				break;
			}
			default: {
				System.out.println("Invalid number entered.\n");
				break;
			}
			}

		} while (menuSelection != 4);

		userInput.close();

	}

	// menus
	// ======================================================================================
	public int unitMenuPrompt() {
		String[] promptMsg = { "Please select an option:", "1. Volume", "2. Distance", "3. Temperature", "4. Quit" };

		for (String line : promptMsg) {
			System.out.println(line);
		}
		System.out.print("\nEnter selection: ");

		return userInput.nextInt();
	}

	@SuppressWarnings("DuplicatedCode")
	public void volumeMenu() {
		String[] promptMsg1 = { "Please select initial unit type:", "1. Cups", "2. Teaspoons", "3. US Gallons",
				"4. Imperial Gallons" };

		int volumeSelection1, volumeSelection2;

		do {
			for (String line : promptMsg1) {
				System.out.println(line);
			}
			System.out.print("\nEnter selection: ");
			volumeSelection1 = userInput.nextInt();
		} while (volumeSelection1 > 4 | volumeSelection1 < 1);

		String[] promptMsg2 = new String[4];
		promptMsg2[0] = "Please select final unit type:";

		switch (volumeSelection1) {
		case 1:
			promptMsg2[1] = "1. Teaspoons";
			promptMsg2[2] = "2. US Gallons";
			promptMsg2[3] = "3. Imperial Gallons";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				volumeSelection2 = userInput.nextInt();
			} while (volumeSelection2 > 3 | volumeSelection2 < 1);

			if (volumeSelection2 == 1) {
				cupsToTeaspoons();
			} else if (volumeSelection2 == 2) {
				cupsToUSGallons();
			} else {
				cupsToIGallons();
			}
			break;

		case 2:
			promptMsg2[1] = "1. Cups";
			promptMsg2[2] = "2. US Gallons";
			promptMsg2[3] = "3. Imperial Gallons";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				volumeSelection2 = userInput.nextInt();
			} while (volumeSelection2 > 3 | volumeSelection2 < 1);

			if (volumeSelection2 == 1) {
				teaspoonsToCups();
			} else if (volumeSelection2 == 2) {
				teaspoonsToUSGallons();
			} else {
				teaspoonsToIGallons();
			}
			break;
		case 3:
			promptMsg2[1] = "1. Cups";
			promptMsg2[2] = "2. Teaspoons";
			promptMsg2[3] = "3. Imperial Gallons";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				volumeSelection2 = userInput.nextInt();
			} while (volumeSelection2 > 3 | volumeSelection2 < 1);

			if (volumeSelection2 == 1) {
				USGallonsToCups();
			} else if (volumeSelection2 == 2) {
				USGallonsToTeaspoons();
			} else {
				USGallonsToIGallons();
			}
			break;
		case 4:
			promptMsg2[1] = "1. Cups";
			promptMsg2[2] = "2. Teaspoons";
			promptMsg2[3] = "3. US Gallons";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				volumeSelection2 = userInput.nextInt();
			} while (volumeSelection2 > 3 | volumeSelection2 < 1);

			if (volumeSelection2 == 1) {
				IGallonsToCups();
			} else if (volumeSelection2 == 2) {
				IGallonsToTeaspoons();
			} else {
				IGallonsToUSGallons();
			}
			break;
		default:
			System.out.println("Invalid selection made.\n");
			volumeMenu();
			break;

		}

	}

	public void distanceMenu() {
		String[] promptMsg1 = { "Please select initial unit type:", "1. Feet", "2. Miles", "3. Kilometers",
				"4. Nautical Miles" };

		int distanceSelection1, distanceSelection2;

		do {
			for (String line : promptMsg1) {
				System.out.println(line);
			}
			System.out.print("\nEnter selection: ");
			distanceSelection1 = userInput.nextInt();
		} while (distanceSelection1 > 4 | distanceSelection1 < 1);

		String[] promptMsg2 = new String[4];
		promptMsg2[0] = "Please select final unit type:";

		switch (distanceSelection1) {
		case 1:
			promptMsg2[1] = "1. Miles";
			promptMsg2[2] = "2. Kilometers";
			promptMsg2[3] = "3. Nautical Miles";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				distanceSelection2 = userInput.nextInt();
			} while (distanceSelection2 > 3 | distanceSelection2 < 1);

			if (distanceSelection2 == 1) {
				feetToMiles();
			} else if (distanceSelection2 == 2) {
				feetToKilometers();
			} else {
				feetToNauticalMiles();
			}
			break;

		case 2:
			promptMsg2[1] = "1. Feet";
			promptMsg2[2] = "2. Kilometers";
			promptMsg2[3] = "3. Nautical Miles";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				distanceSelection2 = userInput.nextInt();
			} while (distanceSelection2 > 3 | distanceSelection2 < 1);

			if (distanceSelection2 == 1) {
				milesToFeet();
			} else if (distanceSelection2 == 2) {
				milesToKilometers();
			} else {
				milesToNauticalMiles();
			}
			break;
		case 3:
			promptMsg2[1] = "1. Miles";
			promptMsg2[2] = "2. Feet";
			promptMsg2[3] = "3. Nautical Miles";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				distanceSelection2 = userInput.nextInt();
			} while (distanceSelection2 > 3 | distanceSelection2 < 1);

			if (distanceSelection2 == 1) {
				kilometersToMiles();
			} else if (distanceSelection2 == 2) {
				kilometersToFeet();
			} else {
				kilometersToNauticalMiles();
			}
			break;
		case 4:
			promptMsg2[1] = "1. Miles";
			promptMsg2[2] = "2. Kilometers";
			promptMsg2[3] = "3. Feet";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				distanceSelection2 = userInput.nextInt();
			} while (distanceSelection2 > 3 | distanceSelection2 < 1);

			if (distanceSelection2 == 1) {
				nauticalMilesToMiles();
			} else if (distanceSelection2 == 2) {
				nauticalMilesToKilometers();
			} else {
				nauticalMilesToFeet();
			}
			break;
		default:
			System.out.println("Invalid selection made.\n");
			distanceMenu();
			break;

		}

	}

	public void temperatureMenu() {
		String[] promptMsg1 = { "Please select initial unit type:", "1. Celsius", "2. Fahrenheit", "3. Kelvin" };

		int temperatureSelection1, temperatureSelection2;

		do {
			for (String line : promptMsg1) {
				System.out.println(line);
			}
			System.out.print("\nEnter selection: ");
			temperatureSelection1 = userInput.nextInt();
		} while (temperatureSelection1 > 3 | temperatureSelection1 < 1);

		String[] promptMsg2 = new String[4];
		promptMsg2[0] = "Please select final unit type:";

		switch (temperatureSelection1) {
		case 1:
			promptMsg2[1] = "1. Fahrenheit";
			promptMsg2[2] = "2. Kelvin";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				temperatureSelection2 = userInput.nextInt();
			} while (temperatureSelection2 > 2 | temperatureSelection2 < 1);

			if (temperatureSelection2 == 1) {
				celsiusToFahrenheit();
			} else {
				celsiusToKelvin();
			}
			break;

		case 2:
			promptMsg2[1] = "1. Celsius";
			promptMsg2[2] = "2. Kelvin";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				temperatureSelection2 = userInput.nextInt();
			} while (temperatureSelection2 > 2 | temperatureSelection2 < 1);

			if (temperatureSelection2 == 1) {
				fahrenheitToCelsius();
			} else {
				fahrenheitToKelvin();
			}
			break;
		case 3:
			promptMsg2[1] = "1. Celsius";
			promptMsg2[2] = "2. Fahrenheit";

			do {
				for (String line : promptMsg2) {
					System.out.println(line);
				}
				System.out.print("\nEnter selection: ");
				temperatureSelection2 = userInput.nextInt();
			} while (temperatureSelection2 > 2 | temperatureSelection2 < 1);

			if (temperatureSelection2 == 1) {
				kelvinToCelsius();
			} else {
				kelvinToFahrenheit();
			}
			break;
		default:
			System.out.println("Invalid selection made.\n");
			temperatureMenu();
			break;

		}

	}

	// Volume Conversion Methods
	// =====================================================================================
	// Cups to
	private void cupsToTeaspoons() {
		System.out.print("Enter the number of cups: ");
		double cups = userInput.nextDouble();

		double teaspoons = cups * 48;
		System.out.println(cups + " cups equals " + teaspoons + " teaspoons.\n");
	}

	private void cupsToUSGallons() {
		System.out.print("Enter the number of cups: ");
		double cups = userInput.nextDouble();

		double gallons = cups * 0.0625;
		System.out.println(cups + " cups equals " + gallons + " US gallons.\n");
	}

	private void cupsToIGallons() {
		System.out.print("Enter the number of cups: ");
		double cups = userInput.nextDouble();

		double gallons = cups * 0.05204197;
		System.out.println(cups + " cups equals " + gallons + " Imperial gallons.\n");
	}

	// Teaspoons to
	private void teaspoonsToCups() {
		System.out.print("Enter the number of teaspoons: ");
		double teaspoons = userInput.nextDouble();

		double cups = teaspoons * 0.02083333;
		System.out.println(teaspoons + " teaspoons equals " + cups + " cups.\n");
	}

	private void teaspoonsToUSGallons() {
		System.out.print("Enter the number of teaspoons: ");
		double teaspoons = userInput.nextDouble();

		double gallons = teaspoons * 0.001302083;
		System.out.println(teaspoons + " teaspoons equals " + gallons + " US gallons.\n");
	}

	private void teaspoonsToIGallons() {
		System.out.print("Enter the number of teaspoons: ");
		double teaspoons = userInput.nextDouble();

		double gallons = teaspoons * 0.001084208;
		System.out.println(teaspoons + " teaspoons equals " + gallons + " Imperial gallons.\n");
	}

	// US Gallons to
	private void USGallonsToCups() {
		System.out.print("Enter the number of US gallons: ");
		double gallons = userInput.nextDouble();
		double cups = gallons * 16;
		System.out.println(gallons + " US gallons equals " + cups + " cups.\n");
	}

	private void USGallonsToTeaspoons() {
		System.out.print("Enter the number of US gallons: ");
		double gallons = userInput.nextDouble();
		double teaspoons = gallons * 768;
		System.out.println(gallons + " US gallons equals " + teaspoons + " teaspoons.\n");
	}

	private void USGallonsToIGallons() {
		System.out.print("Enter the number of US gallons: ");
		double USGallons = userInput.nextDouble();
		double IGallons = USGallons * 0.8326716;
		System.out.println(USGallons + " US gallons equals " + IGallons + " Imperial gallons.\n");
	}

	// Imperial Gallons to
	private void IGallonsToCups() {
		System.out.print("Enter the number of Imperial gallons: ");
		double gallons = userInput.nextDouble();
		double cups = gallons * 19.21526;
		System.out.println(gallons + " Imperial gallons equals " + cups + " cups.\n");
	}

	private void IGallonsToTeaspoons() {
		System.out.print("Enter the number of Imperial gallons: ");
		double gallons = userInput.nextDouble();
		double teaspoons = gallons * 922.3324;
		System.out.println(gallons + " Imperial gallons equals " + teaspoons + " teaspoons.\n");
	}

	private void IGallonsToUSGallons() {
		System.out.print("Enter the number of Imperial gallons: ");
		double IGallons = userInput.nextDouble();
		double USGallons = IGallons * 1.200954;
		System.out.println(IGallons + " Imperial gallons equals " + USGallons + " US gallons.\n");
	}

	// Distance
	// ====================================================================================
	// miles to
	private void milesToFeet() {
		System.out.print("Enter the number of miles: ");
		double miles = userInput.nextDouble();
		double feet = miles * 5280;
		System.out.println(feet + " miles equals " + feet + " feet.\n");
	}

	private void milesToKilometers() {
		System.out.print("Enter the number of miles: ");
		double miles = userInput.nextDouble();
		double km = miles * 1.609344;
		System.out.println(miles + " miles equals " + km + " kilometers.\n");
	}

	private void milesToNauticalMiles() {
		System.out.print("Enter the number of miles: ");
		double miles = userInput.nextDouble();
		double nauticalMiles = miles * 0.8689758;
		System.out.println(miles + " miles equals " + nauticalMiles + " nautical miles.\n");
	}

	// kilometers to
	private void kilometersToFeet() {
		System.out.print("Enter the number of kilometers: ");
		double kilometers = userInput.nextDouble();
		double feet = kilometers * 3280.84;
		System.out.println(kilometers + " kilometers equals " + feet + " feet.\n");
	}

	private void kilometersToMiles() {
		System.out.print("Enter the number of kilometers: ");
		double kilometers = userInput.nextDouble();
		double miles = kilometers * 0.6213712;
		System.out.println(kilometers + " kilometers equals " + miles + " kilometers.\n");
	}

	private void kilometersToNauticalMiles() {
		System.out.print("Enter the number of kilometers: ");
		double kilometers = userInput.nextDouble();
		double nauticalMiles = kilometers * 0.5399565;
		System.out.println(kilometers + " kilometers equals " + nauticalMiles + " nautical miles.\n");
	}

	// nautical mile to
	private void nauticalMilesToMiles() {
		System.out.print("Enter the number of feet: ");
		double nauticalMiles = userInput.nextDouble();
		double miles = nauticalMiles * 1.15078;
		System.out.println(nauticalMiles + " nautical miles equals " + miles + " miles.\n");
	}

	private void nauticalMilesToKilometers() {
		System.out.print("Enter the number of feet: ");
		double nauticalMiles = userInput.nextDouble();
		double km = nauticalMiles * 1.852001;
		System.out.println(nauticalMiles + " nautical miles equals " + km + " kilometers.\n");
	}

	private void nauticalMilesToFeet() {
		System.out.print("Enter the number of feet: ");
		double nauticalMiles = userInput.nextDouble();
		double feet = nauticalMiles * 6076.118;
		System.out.println(nauticalMiles + " nautical miles equals " + feet + " feet.\n");
	}

	// feet to
	private void feetToMiles() {
		System.out.print("Enter the number of feet: ");
		double feet = userInput.nextDouble();
		double miles = feet * 0.0001893939;
		System.out.println(feet + " feet equals " + miles + " miles.\n");
	}

	private void feetToKilometers() {
		System.out.print("Enter the number of feet: ");
		double feet = userInput.nextDouble();
		double km = feet * 0.0003048;
		System.out.println(feet + " feet equals " + km + " kilometers.\n");
	}

	private void feetToNauticalMiles() {
		System.out.print("Enter the number of feet: ");
		double feet = userInput.nextDouble();
		double nauticalMiles = feet * 0.0001645788;
		System.out.println(feet + " feet equals " + nauticalMiles + " nautical miles.\n");
	}

	// Temperature
	// ===================================================================================

	// Celsius to
	private void celsiusToKelvin() {
		System.out.print("Enter the temperature in Celsius: ");
		double celsius = userInput.nextDouble();
		double kelvin = celsius + 273.15;
		System.out.println(celsius + "˚ Celsius equals " + kelvin + " Kelvin.\n");
	}

	private void celsiusToFahrenheit() {
		System.out.print("Enter the number of Celsius: ");
		double celsius = userInput.nextDouble();
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println(celsius + "˚ Celsius equals " + fahrenheit + " Fahrenheit.\n");
	}

	// Fahrenheit to
	private void fahrenheitToKelvin() {
		System.out.print("Enter the temperature in Fahrenheit: ");
		double fahrenheit = userInput.nextDouble();
		double kelvin = ((fahrenheit - 32) / 1.8 + 273.15);
		System.out.println(fahrenheit + "˚ Fahrenheit equals " + kelvin + " Kelvin.\n");
	}

	private void fahrenheitToCelsius() {
		System.out.print("Enter the number of Fahrenheit: ");
		double fahrenheit = userInput.nextDouble();
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.println(fahrenheit + "˚ Fahrenheit equals " + celsius + " Celsius.\n");
	}

	// Kelvin to
	private void kelvinToFahrenheit() {
		System.out.print("Enter the temperature in Kelvin: ");
		double kelvin = userInput.nextDouble();
		double fahrenheit = (kelvin - 273.15) * 1.8 + 32;
		System.out.println(kelvin + "˚ Kelvin equals " + fahrenheit + " Fahrenheit.\n");
	}

	private void kelvinToCelsius() {
		System.out.print("Enter the number of Kelvin: ");
		double kelvin = userInput.nextDouble();
		double celsius = kelvin - 273.15;
		System.out.println(kelvin + "˚ Kelvin equals " + celsius + " Celsius.\n");
	}

}
