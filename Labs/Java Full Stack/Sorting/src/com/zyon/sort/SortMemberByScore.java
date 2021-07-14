package com.zyon.sort;

import java.util.Comparator;

import com.zyon.model.*;

public class SortMemberByScore implements Comparator<Member>{
	//Descending order
	public int compare(Member a, Member b) {
		return b.getAverageScore() - a.getAverageScore();
	}
}
