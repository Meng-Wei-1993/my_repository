package com.cj.sep25;

import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
 * @author MengWei 2018年9月25日
 */
public class Task07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input:");
		char[] ch = scan.nextLine().toCharArray();
		scan.close();
		int[] count = new int[4];
		for (int i = 0; i < ch.length; i++) {
			if(Pattern.matches("[a-zA-Z]", Character.toString(ch[i]))){
				count[0]++;
			}else if(Pattern.matches("[0-9]", Character.toString(ch[i]))){
				count[1]++;
			}else if(Pattern.matches(" ", Character.toString(ch[i]))){
				count[2]++;
			}else{
				count[3]++;
			}
		}
		System.out.println("letter:"+count[0]+" number:"+count[1]+" blank:"+count[2]+" other:"+count[3]);
	}
}
