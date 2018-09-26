package com.cj.sep26;

public class Task01 {
	public static void main(String[] args) {
		for (int i=5; i <= 100; i+=5) {
			for (int j=3; i+j <= 100; j+=3) {
				for (int k=1; i+j+k <= 100; k++) {
					if((i/5+j/3+3*k==100)&&(i+j+k==100)){
						System.out.println("cock:"+(i/5)+" hen:"+(j/3)+" chick:"+(3*k));
					}
				}
			}
		}
	}
}
