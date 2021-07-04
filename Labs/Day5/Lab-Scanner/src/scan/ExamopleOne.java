package scan;

import java.util.Scanner;

public class ExamopleOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type on a line and hit Enter.");
		
		String line = scanner.nextLine();
		System.out.println("You have typed: " + line);
		
		scanner.close();
		
		String numbers = "1 2 3 5 7 9";
		
		scanner = new Scanner(numbers);
		
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
			
		}
		scanner.close();
	}
}
