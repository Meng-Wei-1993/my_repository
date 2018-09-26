package com.cj.sep25;
/**
 * 程序功能：若一个四位正整数是另一个正整数的平方，且各位数字的和是一个平方数，则称该四位正整数是“四位双平方数”，求最小的 “四位双平方数”
 * @author ASUS
 *
 */

public class Task03 {
	public static void main(String[] args) {
		for(int i=1000;i<10000;i++){
			if(Math.sqrt(i)-(int)(Math.sqrt(i))==0){
				int a = i/1000+i/100%10+i/10%10+i%10;
				if(Math.sqrt(a)-(int)(Math.sqrt(a))==0){
					System.out.println(i);
					return;
				}
			}
		}
	}
}
