package com.cj.sep21;
/**
 * ��һ��������10�����飬Ҫ��ɾ��ĳһ��λ�õ�Ԫ�أ����Ԫ��ǰ��

 * @author ASUS
 *
 */

public class Task07 {
	public static void main(String[] args) {
		int[] oldArray = new int[10];
		int[] newArray = new int[9];
		System.out.print("OldArray : ");
		for (int i = 0; i < oldArray.length; i++) {
			oldArray[i] = (int)(Math.random()*100);
			System.out.print(oldArray[i]+" ");
		}
		int index = (int)(Math.random()*10);
		System.out.println("\r\nThe index : "+index+"(from 0-9)");
		for (int i = 0; i < index; i++) {
			newArray[i] = oldArray[i];
		}
		for (int i = index+1; i < oldArray.length; i++) {
			newArray[i-1] = oldArray[i];
		}
		System.out.print("NewArray : ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+" ");
		}
	}
}
