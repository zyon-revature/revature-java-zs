package com.zyon.test;

import com.zyon.model.*;

public class Simulation {

	public static void main(String[] args) {
		// Group A members
		// There are three ways to add scores to the member class
		// Use the 'add()' method from the ArrayList data type
//		Member jack = new Member("Jack");
//		jack.getScores().add(85);
//		jack.getScores().add(65);
//		jack.getScores().add(95);
//		jack.setAverageScore(); // calculate the average of the scores the average

		// Use the addScore method
//		Member jessie = new Member("Jessie");
//		jessie.addScore(84, 99, 56);

		// Use a constructor w/ the name and varargs
//		Member bill = new Member("Bill", 74, 93, 85);

//		Group A = new Group("Group A", bill, jessie, jack);

		// Group B members
//		Group B = new Group("Group B", new Member("Das", 83, 43, 85), new Member("Jill", 83, 77, 65),
//				new Member("Greg", 83, 43, 87));

		// Group C members
//		Group C = new Group("Group C", new Member("Nina", 83, 93, 85), new Member("Amy", 83, 77, 100),
//				new Member("Quin", 83, 77, 80));
		
		// Group D members - Wanted to see what would happen if the scores were the same
//				Group D = new Group("Group D", new Member("Marco", 83, 93, 85), new Member("Kia", 83, 77, 100),
//						new Member("Tina", 83, 77, 80));

		// Create Group ArrayList
//		ArrayList<Group> groups = new ArrayList<Group>();
		
//		groups.add(A);
//		groups.add(B);
//		groups.add(C);
//		groups.add(D);

		// Sort Group ArrayList using Comparator
//		Collections.sort(groups, new SortGroupByScore());
		
		//Output
//		for (Group group : groups) {
//			group.Display();
//		}
		
		// Test member
//		Member testM = new Member().createMember();
//		System.out.println(testM);
		
		//Test Group for adding members
		Group test = new Group().createGroup();
		test.Display();
		
		
		

	}
}
