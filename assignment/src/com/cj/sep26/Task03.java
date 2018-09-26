package com.cj.sep26;

public class Task03 {
	public static void main(String[] args) {
		double base = 3000;
		double dearnessAllowance = 0.4*base;
		double rentalAllowance = 0.25*base;
		double sum = base+dearnessAllowance+rentalAllowance;
		System.out.println("base:"+base);
		System.out.println("dearnessAllowance:"+dearnessAllowance);
		System.out.println("rentalAllowance:"+rentalAllowance);
		System.out.println("sum:"+sum);
	}
}
