package com.cj.sep25;
/**
 * �����ܣ�����y=1+2/3+3/5+4/7+��+n/(2*n-1)(n=50), Ҫ�󣺰���������ķ�ʽ��ȷ��С�����ڶ�λ��
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
