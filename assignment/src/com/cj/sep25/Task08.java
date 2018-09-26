package com.cj.sep25;
/**
 * 从键盘上输入10个整数，并将其放入一个一维数组中，然后将其前5个元素与后5个元素对换，
 * 即：第1个元素与第10个元素互换，第2个元素与第9个元素互换…第5个元素与第6个元素互换。
 * 分别输出数组原来各元素的值和对换后各元素的值
 * @author ASUS
 *
 */

public class Task08 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[i];
			arr[i] = temp;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
