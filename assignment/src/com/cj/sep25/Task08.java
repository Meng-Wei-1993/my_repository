package com.cj.sep25;
/**
 * �Ӽ���������10�����������������һ��һά�����У�Ȼ����ǰ5��Ԫ�����5��Ԫ�ضԻ���
 * ������1��Ԫ�����10��Ԫ�ػ�������2��Ԫ�����9��Ԫ�ػ�������5��Ԫ�����6��Ԫ�ػ�����
 * �ֱ��������ԭ����Ԫ�ص�ֵ�ͶԻ����Ԫ�ص�ֵ
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
