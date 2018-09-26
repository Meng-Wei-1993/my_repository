package com.cj.sep20;

public class Task05 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=100;i<1000;i++){
			if(i%3==0){
				int a = i/100;
				int b = i/10%10;
				int c = i%10;
				if(a==5||b==5||c==5){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
