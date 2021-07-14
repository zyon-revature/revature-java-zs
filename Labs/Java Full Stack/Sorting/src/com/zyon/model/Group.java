package com.zyon.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


import com.zyon.sort.SortMemberByScore;

import java.lang.StringBuilder;

public class Group {
	ArrayList<Member> group = new ArrayList<Member>();
	protected ArrayList<Integer> averageMemberScores = new ArrayList<Integer>();
	protected int averageScore;
	protected String name;
	
	public Group(String name, Member ...members) {
		this.name = name;
		for(Member member: members) {
			this.group.add(member);
			sortMembers();
			this.averageMemberScores.add(member.averageScore);
		}
		
		setAverageScore(this.averageMemberScores);
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Group Name: " + this.name + "\t" + "Average Score: " + this.averageScore);
		return result.toString();
		
	}
	
	// Display name of group, group average score, 
	public void Display() {
		StringBuilder result = new StringBuilder();
		result.append(toString());
		for(Member member: this.group) {
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
		
		while(it.hasNext()) {
			int num = it.next();
			result = result + num;
		}
		return (int) result/numbers.size();
		
	}
	
	public void setAverageScore() {
		int result = calculateAverage(this.averageMemberScores);
		this.averageScore =  result;
	}
	
	
	public void setAverageScore(ArrayList<Integer> scores) {
		int result = calculateAverage(scores);
		this.averageScore =  result;
	}
	
}
