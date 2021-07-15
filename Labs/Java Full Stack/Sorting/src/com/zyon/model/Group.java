package com.zyon.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.zyon.sort.SortMemberByScore;

import java.lang.StringBuilder;

public class Group {
	ArrayList<Member> group = new ArrayList<Member>();
	protected ArrayList<Integer> averageMemberScores = new ArrayList<Integer>();
	protected int averageScore;
	protected String name;

	public Group(String name, ArrayList<Member>members) {
		this.name = name;
		for (Member member : members) {
			this.group.add(member);
			sortMembers();
			this.averageMemberScores.add(member.averageScore);
		}

		setAverageScore(this.averageMemberScores);
	}
	
	public Group(String name, Member... members) {
		this.name = name;
		for (Member member : members) {
			this.group.add(member);
			sortMembers();
			this.averageMemberScores.add(member.averageScore);
		}

		setAverageScore(this.averageMemberScores);
	}
	

	public Group(String name) {
		this.name = name;
		this.averageScore = 0;
	}

	public Group() {
		this.name = "No Name";
		this.averageScore = 0;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\nGroup Name: " + this.name + "\t" + "Average Score: " + this.averageScore);
		return result.toString();

	}

	// Display name of group, group average score,
	public void Display() {
		StringBuilder result = new StringBuilder();
		result.append(toString());
		for (Member member : this.group) {
			String txt = member.toString();
			result.append("\n" + txt);
		}
		result.append("\n");
		System.out.println(result.toString());

	}

	protected void sortMembers() {
		Collections.sort(this.group, new SortMemberByScore());
	}

	public int getAverageScore() {
		return this.averageScore;
	}

	public int calculateAverage(ArrayList<Integer> numbers) {
		Iterator<Integer> it = numbers.iterator();
		int result = 0;

		while (it.hasNext()) {
			int num = it.next();
			result = result + num;
		}
		return (int) result / numbers.size();

	}

	public void setAverageScore() {
		int result = calculateAverage(this.averageMemberScores);
		this.averageScore = result;
	}

	public void setAverageScore(ArrayList<Integer> scores) {
		int result = calculateAverage(scores);
		this.averageScore = result;
	}

	// User input
//	public Group createGroup() {
//		Group newGroup = new Group();
//		Scanner sc = new Scanner(System.in);
//		// Add name
//		addGroupPrompt();
//		String groupName;
//		groupName = sc.nextLine();
//		
//		//Get memberCount
//		int memberCount;
//		System.out.print("Enter count for members: ");
//		memberCount = sc.nextInt();
//		
//		Ar
//		for(int i = 0; i < memberCount;i++) {
//			newGroup.group.add(new Member().createMember(sc));
//		}
//		sc.close();
//		newGroup.setAverageScore();
//		
//		return newGroup;
//
//	}
	
	public Group createGroup() {
		Scanner sc = new Scanner(System.in);
		// Add name
		addGroupPrompt();
		String groupName;
		groupName = sc.nextLine();
		
		//Get memberCount
		int memberCount;
		System.out.print("Enter count for members: ");
		memberCount = Integer.parseInt(sc.nextLine());
		
		//Member List
		ArrayList<Member> mList = new ArrayList<Member>();
		for(int i = 0; i < memberCount;i++) {
			mList.add(new Member().createMember(sc));
		}
		sc.close();
		
		Collections.sort(mList, new SortMemberByScore());
		
		return new Group(groupName, mList);

	}

	public void setName(String name) {
		this.name = name;
		
	}

	public static void addGroupPrompt() {
		System.out.print("Enter group name: ");
	}

}
