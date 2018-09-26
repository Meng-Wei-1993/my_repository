package com.cj.sep21;

public class Task03 {
	public static void main(String[] args) {
		int year = (int)(Math.random()*2018+1);
		int month = (int)(Math.random()*12+1);
		System.out.println("Year:"+year+" Month:"+month);
		if(month==2){
			if((year%100!=0&&year%4==0)||(year%400==0)){
				for (int i = 0; i < 29; i++) {
					System.out.print(i+1+" ");
				}
			}else{
				for (int i = 0; i < 28; i++) {
					System.out.print(i+1+" ");
				}
			}
			return;
		}
		if(month<8&&month%2==1){
			for (int i = 0; i < 31; i++) {
				System.out.print(i+1+" ");
			}
		}
		if(month<8&&month%2==0){
			for (int i = 0; i < 30; i++) {
				System.out.print(i+1+" ");
			}
		}
		if(month>7&&month%2==1){
			for (int i = 0; i < 30; i++) {
				System.out.print(i+1+" ");
			}
		}
		if(month>7&&month%2==0){
			for (int i = 0; i < 31; i++) {
				System.out.print(i+1+" ");
			}
		}
	}
}
