package com.cj.sep20;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Task02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		char[] ch01 = str.toCharArray();
		TreeSet<Character> treeCh = new TreeSet<Character>(); 
		for (int i = 0; i < ch01.length; i++) {
			if('A'<ch01[i]&&ch01[i]<'z'){
				treeCh.add(ch01[i]);
			}		
		}
		int[] arr01 = new int[treeCh.size()];
		char[] arr02 = new char[treeCh.size()];
		int i = 0;
		for (Iterator<Character> iterator = treeCh.iterator(); iterator.hasNext();) {
			arr02[i] = (Character) iterator.next();
			i++;
		}
		for (int j = 0; j < ch01.length; j++) {
			for (int j2 = 0; j2 < arr02.length; j2++) {
				if(arr02[j2]==ch01[j]){
					arr01[j2]++;
					break;
				}
			}
		}	
		for (int j = 0; j < arr02.length; j++) {
			System.out.print(arr02[j]+":"+arr01[j]+" ");
		}
	}
}
