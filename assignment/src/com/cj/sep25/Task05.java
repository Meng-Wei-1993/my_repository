package com.cj.sep25;
/**
 * 随便输入一段字符串，把出现次数最多的打印出来,如:aabbbbbbbbbcccdffff,就把b打印出来,用java代码实现
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input:");
		char[] ch = scan.nextLine().toCharArray();
		scan.close();
		ArrayList<Character> arrList = new ArrayList<Character>();
		for (int i = 0; i < ch.length; i++) {
			if(!arrList.contains(ch[i])){
				arrList.add(ch[i]);
			}
		}
		int[] charCount = new int[arrList.size()];
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < arrList.size(); j++) {
				if(ch[i]==arrList.get(j)){
					charCount[j]++;
				}
			}
		}
		int max = 0;
		for (int i = 0; i < charCount.length; i++) {
			if(charCount[i]>max){
				max = charCount[i];
			}
		}
		for (int i = 0; i < charCount.length; i++) {
			if(charCount[i]==max){
				System.out.println(""+arrList.get(i)+" : "+charCount[i]);
			}
		}
	}
}
