package com.cj.sep20;

import java.util.HashMap;
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input number:");		
		int num = Integer.parseInt(scan.nextLine());
		scan.close();
		HashMap<Integer, String> relation = new HashMap<Integer, String>();
		relation.put(0, "��");
		relation.put(1, "Ҽ");
		relation.put(2, "��");
		relation.put(3, "��");
		relation.put(4, "��");
		relation.put(5, "��");
		relation.put(6, "½");
		relation.put(7, "��");
		relation.put(8, "��");
		relation.put(9, "��");
		char[] arrChar = Integer.toString(num).toCharArray();
		int count = arrChar.length;
		int[] arrInt = new int[count];				
		String str = "";
		for (int i = 0; i < arrChar.length; i++) {
			arrInt[i] = arrChar[i] - 48;
		}
		for (int i = 0; i < arrInt.length/2; i++) {
			int temp = arrInt[arrInt.length-1-i];
			arrInt[arrInt.length-1-i] = arrInt[i];
			arrInt[i] = temp;
		}
		for (int i = 0; i < arrInt.length; i++) {		
			str += relation.get(arrInt[arrInt.length-i-1]);
			if((arrInt.length-i-1)%4==0){
				if((arrInt.length-i-1)==0){
				}else if((arrInt.length-i-1)==4){
					str += "��";
				}else if((arrInt.length-i-1)==8){
					str += "��";
				}
			}else if((arrInt.length-i-1)%4==1&&arrInt[arrInt.length-i-1]!=0){
				str += "ʰ";
			}else if((arrInt.length-i-1)%4==2&&arrInt[arrInt.length-i-1]!=0){
				str += "��";
			}else if((arrInt.length-i-1)%4==3&&arrInt[arrInt.length-i-1]!=0){
				str += "Ǫ";
			}
		}
		String  str1 = str.replaceAll("��+", "��");
		String  str2 = str1.replaceAll("����", "��");
		String  str3 = str2.replaceAll("����", "��");
		String  str4 = str3.replaceAll("����", "��");
		if(str4.endsWith("��")){
			String str5 = str4.substring(0, str4.length()-1);
			System.out.println(str5);
			return;
		}
				
		System.out.println(str4);
	}
}
