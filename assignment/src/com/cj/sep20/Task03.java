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
		relation.put(0, "Áã");
		relation.put(1, "Ò¼");
		relation.put(2, "·¡");
		relation.put(3, "Èþ");
		relation.put(4, "ËÁ");
		relation.put(5, "Îé");
		relation.put(6, "Â½");
		relation.put(7, "Æâ");
		relation.put(8, "°Æ");
		relation.put(9, "¾Á");
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
					str += "Íò";
				}else if((arrInt.length-i-1)==8){
					str += "ÒÚ";
				}
			}else if((arrInt.length-i-1)%4==1&&arrInt[arrInt.length-i-1]!=0){
				str += "Ê°";
			}else if((arrInt.length-i-1)%4==2&&arrInt[arrInt.length-i-1]!=0){
				str += "°Û";
			}else if((arrInt.length-i-1)%4==3&&arrInt[arrInt.length-i-1]!=0){
				str += "Çª";
			}
		}
		String  str1 = str.replaceAll("Áã+", "Áã");
		String  str2 = str1.replaceAll("ÁãÍò", "Íò");
		String  str3 = str2.replaceAll("ÁãÒÚ", "ÒÚ");
		String  str4 = str3.replaceAll("ÒÚÍò", "ÒÚ");
		if(str4.endsWith("Áã")){
			String str5 = str4.substring(0, str4.length()-1);
			System.out.println(str5);
			return;
		}
				
		System.out.println(str4);
	}
}
