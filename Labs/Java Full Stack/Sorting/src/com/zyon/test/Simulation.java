package com.zyon.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.zyon.model.*;
import com.zyon.sort.SortGroupByScore;

public class Simulation {

	public static void main(String[] args) {
		ArrayList<Group> groups = new ArrayList<Group>();
		Scanner input = new Scanner(System.in);

		int groupCount;
		System.out.print("Enter number of groups: ");
		groupCount = Integer.parseInt(input.nextLine());
		System.out.println();

		for (int i = 0; i < groupCount; i++) {
			groups.add(new Group().createGroup(input));
		}
		// Sort Group ArrayList using Comparator
		Collections.sort(groups, new SortGroupByScore());

		input.close();
		// Output
		for (Group group : groups) {
			group.Display();
		}
	}
}
