package com.cj.sep25;
/**
 * 程序功能：计算y=1+2/3+3/5+4/7+…+n/(2*n-1)(n=50), 要求：按四舍五入的方式精确到小数点后第二位。
 * @author ASUS
 *
 */

public class Task04 {
	public static void main(String[] args) {
		double sum = 0;
		for (double i = 1; i <= 50; i++) {
			sum += i/(2*i-1);
		}
		
		System.out.println(String.format("%.2f", sum));
	}
}
