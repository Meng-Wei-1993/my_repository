package com.cj.sep21;
/**
 * 有一个两位数，如果在它的前面添一个3，可得到一个三位数；把3添在它的后面，也可以得到一个三位数。这两个三位数相差468，求原来的两位数。
 * @author ASUS
 *
 */

public class Task02 {
	public static void main(String[] args) {
		for(int i=10;i<100;i++){
			int a = i+300;
			int b = 10*i +3;
			if(a-b==468||b-a==468){
				System.out.println(i);
			}
		}
	}
}
