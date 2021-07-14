package com.zyon.sort;

import java.util.Comparator;

import com.zyon.model.*;

public class SortGroupByScore implements Comparator<Group>{
	public int compare(Group a, Group b) {
		return b.getAverageScore() - a.getAverageScore();
	}
}
