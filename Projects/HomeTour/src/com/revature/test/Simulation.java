package com.revature.test;

import java.util.Scanner;

import com.revature.adventure.Building;
import com.revature.adventure.Item;
import com.revature.adventure.Room;

public class Simulation {

	public static void main(String[] args) {
		Building house = new Building();
		house.setShortDescription("Creepy House");
		house.setAddress("1496 Andrea Way");
		house.setRoomCount(10);
		house.setConditon("Rundown");
		house.setLongDescription(
				"An abandoned house at the end of coutry road." + "\n24 years ago a family just disapeared one day."
						+ "\nAll of their posseesions where left behind." + "\nThe house has been vancant since.");
		house.roomList = new Room[house.getRoomCount()];

		for (int i = 0; i < house.roomList.length; i++) {
			house.roomList[i] = new Room();
		}

		// 0
		house.roomList[0].setName("Entrance");
		house.roomList[0].setConditon("Damaged");
		house.roomList[0].setShortDescription("Entryway with a broken front door.");
		house.roomList[0].setLongDescription("It seems that someone let themselves in at one point."
				+ "\nThe front door is splintered of its hinges.");
		house.roomList[0].dirOptions = new String[] { "North" };
		Item woodenPlank = new Item("Wooden Plank", "Swing");
		house.roomList[0].itemList.add(woodenPlank);
		// 1
		house.roomList[1].setName("Kitchen");
		house.roomList[1].setConditon("Dirty");
		house.roomList[1]
				.setShortDescription("Smells like someone hasn't taken out the trash since prehistoric times.");
		house.roomList[1].setLongDescription(
				"This kitchen is covered in cockroaches and you can see a rat scurry under the oven.\n"
						+ "The refrigerator is suprisingly clean.");
		house.roomList[1].dirOptions = new String[] { "North", "East" };
		Item spatula = new Item("Spatula", "Cook a Krabby Patty");
		house.roomList[1].itemList.add(spatula);
		Item stove = new Item("Six-burner Stove", "Light");
		house.roomList[1].itemList.add(stove);

		// 2
		house.roomList[2].setName("Dining Room");
		house.roomList[2].setConditon("Flooded and Moldy");
		house.roomList[2].setShortDescription("A water damaged dining room.");
		house.roomList[2].setLongDescription("A to some point this must have been a great place to throw a party.\n"
				+ "\nNow its a flooded mess. Don't get your shoes wet.");
		house.roomList[2].dirOptions = new String[] { "North" };
		Item oldChair = new Item("Chair", "Sit");
		house.roomList[2].itemList.add(oldChair);
		

		// 3
		house.roomList[3].setName("Entertainment Room");
		house.roomList[3].setConditon("Dusty");
		house.roomList[3].setShortDescription("All the remaining furniture is covered in dust.");
		house.roomList[3].setLongDescription(
				"At one point there this place must have had a couch and one of those of televisions."
						+ "\nYou can still see the imprints in the carpet and the shape of a TV along the dirt stained walls.");
		house.roomList[3].dirOptions = new String[] { "North", "West" };
		Item vhsSet = new Item("First Season of 'The Mighty Morphin Power Rangers'", "Make it your favorite child");
		house.roomList[3].itemList.add(vhsSet);

		// 4
		house.roomList[4].setName("Child's Room");
		house.roomList[4].setConditon("Clean");
		house.roomList[4].setShortDescription("Looks like the kid had a racecar bed.");
		house.roomList[4]
				.setLongDescription("Its kinda freeky how clean this room is. It's as if someome still lives here.");
		house.roomList[4].dirOptions = new String[] { "North", "East", "South" };
		Item doll = new Item("A fancy doll in a crib", "IT HAS A KNIFE");
		house.roomList[4].itemList.add(doll);
		Item book = new Item("Book of Fairytales", "You read Grim Stories");
		house.roomList[4].itemList.add(book);

		// 5
		house.roomList[5].setName("Living Room");
		house.roomList[5].setConditon("Worn");
		house.roomList[5].setShortDescription("Lots of doorways here");
		house.roomList[5].setLongDescription(
				"A room that contains worn furniture, old paintings, and located at the center of the house.");
		house.roomList[5].dirOptions = new String[] { "South", "East", "West" };
		Item pentagram = new Item("An eerie Pentagram", "You summon a demon. It has the cure to cancer, but it doesn't seems like its willing to share.");
		house.roomList[5].itemList.add(pentagram);

		// 6
		house.roomList[6].setName("Garden");
		house.roomList[6].setConditon("Overgrown");
		house.roomList[6].setShortDescription("Unkept Garden");
		house.roomList[6].setLongDescription("A jungle of weeds and pink flamingos.");
		house.roomList[6].dirOptions = new String[] { "South", "West" };
		Item cementery = new Item("Pet Cemetery", "Apparently not all dogs go to heaven.");
		house.roomList[6].itemList.add(cementery);

		// 7
		house.roomList[7].setName("Small Bathroom");
		house.roomList[7].setConditon("Clean");
		house.roomList[7].setShortDescription("The floor is wet.");
		house.roomList[7].setLongDescription(
				"This bathroom is one of the cleanest rooms in the house. \nSomehow the floor is wet, but there aeren't any leaks on the ceiling.");
		house.roomList[7].dirOptions = new String[] { "North" };
		Item toilet = new Item("Toilet", "It doesn't flush.");
		house.roomList[7].itemList.add(toilet);
		Item curtain = new Item("Shower Curtain", "You get a good shower.");
		house.roomList[7].itemList.add(curtain);

		// 8
		house.roomList[8].setName("Dark Room");
		house.roomList[8].setConditon("Empty");
		house.roomList[8].setShortDescription("Room with no windows.");
		house.roomList[8].setLongDescription("The lightbulb seems to be out and there are now windows.");
		house.roomList[8].dirOptions = new String[] { "South" };
		Item darkness = new Item("Darkness", "[Achievement: 'Darkness' is Your friend]");
		house.roomList[7].itemList.add(curtain);

		// 9
		house.roomList[9].setName("Master Bedroom");
		house.roomList[9].setConditon("Smoke Damaged");
		house.roomList[9].setShortDescription("Looks like there was a fire.");
		house.roomList[9].setLongDescription("At room point a fire occured here. It looks like it burned itself out.");
		house.roomList[9].dirOptions = new String[] { "North", "East", "South" };

		int currentRoomIndex = 0;
		Scanner sc = new Scanner(System.in);
		String input, input2, input3;

		introduction(house.getAddress());

		do {
			System.out.println("Current Room:");
			house.roomList[currentRoomIndex].display();
			prompt();
			prompt1();
			input = sc.nextLine();
			if (input.toLowerCase().equals("move")) {
				prompt2();
				input2 = sc.nextLine();
				if (!input2.equals("quit")) {
					currentRoomIndex = goSomeWhere(currentRoomIndex, input2);
				}

			} else if (input.toLowerCase().equals("interact")) {
				prompt3();
				input3 = sc.nextLine();
				if (!input3.equals("quit")) {
					input = input3;
				}
				house.roomList[currentRoomIndex].selectItem(input3);
			}

		} while (!input.equals("quit"));

		sc.close();

	}

	static int goSomeWhere(int roomIndex, String direction) {
		if (roomIndex == 0) {
			switch (direction.toLowerCase()) {
			case "north":
				roomIndex = 1;
				System.out.println("You moved " + direction + "./n");
				break;

			default:
				break;
			}

		} else if (roomIndex == 1) {
			switch (direction.toLowerCase()) {
			case "north":
				roomIndex = 5;
				System.out.println("You moved " + direction + "./n");
				break;
			case "east":
				roomIndex = 2;
				System.out.println("You moved " + direction + "./n");
				break;
			default:
				break;
			}

		} else if (roomIndex == 2) {
			switch (direction.toLowerCase()) {
			case "north":
				roomIndex = 3;
				System.out.println("You moved " + direction + "./n");
				break;

			default:
				break;
			}

		} else if (roomIndex == 3) {
			switch (direction.toLowerCase()) {
			case "north":
				roomIndex = 6;
				System.out.println("You moved " + direction + "./n");
				break;
			case "west":
				roomIndex = 5;
				System.out.println("You moved " + direction + "./n");
				break;
			default:
				break;
			}

		} else if (roomIndex == 4) {
			switch (direction.toLowerCase()) {
			case "north":
				roomIndex = 9;
				System.out.println("You moved " + direction + "./n");
				break;
			case "east":
				roomIndex = 5;
				System.out.println("You moved " + direction + "./n");
				break;
			case "south":
				roomIndex = 7;
				System.out.println("You moved " + direction + "./n");
				break;
			default:
				break;
			}

		} else if (roomIndex == 5) {
			switch (direction.toLowerCase()) {
			case "west":
				roomIndex = 4;
				System.out.println("You moved " + direction + "./n");
				break;
			case "east":
				roomIndex = 1;
				System.out.println("You moved " + direction + "./n");
				break;
			case "south":
				roomIndex = 7;
				System.out.println("You moved " + direction + "./n");
				break;
			default:
				break;
			}

		} else if (roomIndex == 6) {
			switch (direction.toLowerCase()) {
			case "west":
				roomIndex = 9;
				System.out.println("You moved " + direction + "./n");
				break;
			case "south":
				roomIndex = 3;
				System.out.println("You moved " + direction + "./n");
				break;

			default:
				break;
			}
		} else if (roomIndex == 7) {
			switch (direction.toLowerCase()) {
			case "north":
				roomIndex = 4;
				System.out.println("You moved " + direction + "./n");
				break;

			default:
				break;
			}
		} else if (roomIndex == 8) {
			switch (direction.toLowerCase()) {
			case "south":
				roomIndex = 9;
				System.out.println("You moved " + direction + "./n");
				break;
			default:
				break;
			}

		} else if (roomIndex == 9) {
			switch (direction.toLowerCase()) {
			case "north":
				roomIndex = 8;
				System.out.println("You moved " + direction + "./n");
				break;
			case "east":
				roomIndex = 6;
				System.out.println("You moved " + direction + "./n");
				break;
			case "south":
				roomIndex = 4;
				System.out.println("You moved " + direction + "./n");
				break;
			default:
				break;
			}
		}

		return roomIndex;

	}

	static void prompt() {
		System.out.println("Enter 'quit' to stop");
	}

	static void introduction(String address) {
		String intro = "The drive to " + address + " was long and dreary, but your finally here.\n\n";
		System.out.println(intro);
	}

	static void prompt1() {
		System.out.print(
				"Type 'move' to go to anther room or type 'interact' to interact w/ an item." + "\nEnter selection: ");
	}

	static void prompt2() {
		System.out.print("Enter a direction.\nDirection: ");
	}

	static void prompt3() {
		System.out.print("Enter the name of the item you wish to interact with.\nSelection: ");
	}

}
