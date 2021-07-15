package com.zyon.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Member {
	protected int averageScore;
	protected String name;
	protected ArrayList<Integer> scores = new ArrayList<Integer>();

	public Member(String name, int... scores) {
		this.name = name;
		addScore(scores);
		setAverageScore(this.scores);
	}
	
	public Member(String name, ArrayList<Integer> scoresList) {
		this.name = name;
		for(Integer score: scores) {
			this.scores.add(score);
		}
		setAverageScore(scores);
	}

	public Member(String name) {
		this.name = name;
		this.averageScore = 0;
	}
	
	public Member() {
		this.name = "No Name";
		this.averageScore = 0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Member Name: " + this.name + "\t" + "Average Score: " + this.averageScore;
	}

	public void addScore(int... scores) {
		for (int score : scores) {
			this.scores.add(score);
		}
		setAverageScore(this.scores);
	}
	
	public void addScore(ArrayList<Integer> scores) {
		scores.forEach(score -> this.scores.add(score));
		setAverageScore();
	}

	public ArrayList<Integer> getScores() {
		return this.scores;
	}

	// Member Average Score Methods
	public int getAverageScore() {
		return this.averageScore;
	}

	public int calculateAverage(ArrayList<Integer> numbers) {
	
		int result = 0;
		for(int num: numbers) {
			result += num;
		}

		return (int) result / numbers.size();
	}
	

	public void setAverageScore() {
		int result = calculateAverage(this.scores);
		this.averageScore = result;
	}

	public void setAverageScore(ArrayList<Integer> scores) {
		int result = calculateAverage(scores);
		this.averageScore = result;
	}
	
	// User input 
	public Member createMember() {
		Member newMember = new Member();
		Scanner sc = new Scanner(System.in);
		// Add name
		addMemberPrompt();
		String memberName;
		memberName = sc.nextLine();
		newMember.setName(memberName);
		
		int scoreCount;
		System.out.print("Enter score count for " + memberName + ": ");
		scoreCount = Integer.parseInt(sc.nextLine()); 
		System.out.println();
		
		//Add score(s)
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < scoreCount; i++) {
			addScorePrompt(memberName);
			nums.add(Integer.parseInt(sc.nextLine()));
		}
		newMember.addScore(nums);
		
		//Close scanner
		sc.close();
		return newMember;
		
	}
	
	
	public Member createMember(Scanner scan) {
		// Add name
		addMemberPrompt();
		String memberName;
		memberName = scan.nextLine();
		
		//score
		int scoreCount;
		System.out.print("Enter score count for " + memberName + ": ");
		scoreCount = Integer.parseInt(scan.nextLine()); 
		
		//Add score(s)
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < scoreCount; i++) {
			addScorePrompt(memberName);
			nums.add(Integer.parseInt(scan.nextLine()));
		}
		Member newMember = new Member(memberName);
		newMember.addScore(nums);
		newMember.setAverageScore(nums);
		
		return newMember;
		
	}
		
	public static void addMemberPrompt() {
		System.out.print("\nEnter name of member: ");
	}
	
	public static void addScorePrompt(String n) {
		System.out.print("Enter new score for " + n + ": ");
	}

}
