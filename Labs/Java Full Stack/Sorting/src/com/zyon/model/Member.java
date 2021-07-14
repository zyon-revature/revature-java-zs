package com.zyon.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Member {
	protected int averageScore;
	protected String name;
	protected ArrayList<Integer> scores = new ArrayList<Integer>();

	public Member(String name, int... scores) {
		this.name = name;
		addScore(scores);
		setAverageScore(this.scores);
	}

	public Member(String name) {
		this.name = name;
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
		Iterator<Integer> it = numbers.iterator();
		int result = 0;

		while (it.hasNext()) {
			int num = it.next();
			result = result + num;
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

}
