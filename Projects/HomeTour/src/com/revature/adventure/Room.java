package com.revature.adventure;

import java.util.ArrayList;

public class Room extends Thing {
	protected String name;
	public String[] dirOptions;
	public ArrayList<Item> itemList = new ArrayList<Item>();

	public String getName() {
		return this.name;
	}

	public void addItem(Item newItem) {
		this.itemList.add(newItem);
	}

	public void setName(String txt) {
		this.name = txt;

	}

	public void display() {
		System.out.println("Name: " + getName() + "\nCondition: " + getCondition() + "\nShort Description: "
				+ getShortDescription() + "\nLong Description: \n" + getLongDescription() + "\nPath(s): ");

		for (String d : dirOptions) {
			System.out.println("\t" + d);
		}

		System.out.println("Item ");

		for (Item i : itemList) {
			System.out.println("\tName: " + i.name + " - Action: " + i.action);
		}

	}

	public void selectItem(String lookupName) {
		for (Item i : itemList) {
			if (lookupName.equals(i.name)) {
				i.commitInteraction(i.action);
			}
		}
	}

}
