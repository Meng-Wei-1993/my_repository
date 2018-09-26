package com.cj.sep26;

public class Task02 {
	public static void main(String[] args) {
		int hour = (int)(Math.random()*50+50);
		int day = hour/24;
		int residueHour = hour%24;
		System.out.println("hour:"+hour+" day:"+day+" residueHour:"+residueHour);
	}
}
