package com.cj.sep21;
/**
 * ��һ��������10�����飬���������У��û�����һ�����������ʵ�λ��
 */

import java.util.Arrays;

public class Task08 {
	public static void main(String[] args) {
		int[] oldArray = new int[10];
		int[] newArray = new int[11];
		for (int i = 0; i < oldArray.length; i++) {
			oldArray[i] = (int)(Math.random()*100);
		}
		Arrays.sort(oldArray);
		System.out.print("OldArray : ");
		for (int i = 0; i < oldArray.length; i++) {
			System.out.print(oldArray[i]+" ");
		}
		int target = (int)(Math.random()*100);
		System.out.println("\r\nThe target : "+target);
		int i = 0;
		for (; i < oldArray.length; i++) {
			if(oldArray[i]<target){
				newArray[i] = oldArray[i];
			}else{
				break;
			}
		}
		newArray[i] = target;
		for (; i < oldArray.length; i++) {
			newArray[i+1] = oldArray[i];
		}
		System.out.print("NewArray : ");
		for (int j = 0; j < newArray.length; j++) {
			System.out.print(newArray[j]+" ");
		}
	}
}
