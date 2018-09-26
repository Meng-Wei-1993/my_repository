package com.cj.sep20;

public class Task04 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=100;i<1000;i++){
			int a = i/100;
			int b = i/10%10;
			int c = i%10;
			if((a!=b)&&(a!=c)&&(b!=c)&&(i==a*a*a+b*b*b+c*c*c)){
				count++;
			}
		}
		System.out.println(count);
	}
}
