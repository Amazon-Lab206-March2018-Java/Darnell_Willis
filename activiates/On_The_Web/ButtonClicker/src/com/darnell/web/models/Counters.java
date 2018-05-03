package com.darnell.web.models;

public class Counters {
	private static int count = 0;
	
	public Counters() {
		this.setCount(this.getCount() + 1);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
