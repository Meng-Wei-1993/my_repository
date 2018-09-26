package com.cj.sep21;
/**
 * 程序功能：设某四位数的千位数字与十位数字的和等于百位数字与个位数字的积，例如，对于四位数：9512，9+1=5*2，求所有这样的四位数之和
 * @author ASUS
 *
 */

public class Task04 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1000;i<10000;i++){
			if((i/1000+i/10%10)==((i/100%10)*(i%10))){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
