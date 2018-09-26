package com.cj.sep21;
/**
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
成绩>=最高分-10    等级为’A’   
成绩>=最高分-20    等级为’B’
成绩>=最高分-30    等级为’C’   
其余               等级为’D’
提示：先读入学生人数，根据人数创建int数组，存放学生成绩

 * @author ASUS
 *
 */

public class Task06 {
	public static void main(String[] args) {
		int count = (int)(Math.random()*5+5); 
		int[] grade = new int[count];
		String[] name = new String[count];
		int max = 0;
		for (int i = 0; i < name.length; i++) {
			grade[i] = (int)(Math.random()*101);
			name[i] = "name"+i;
			max = max>grade[i]?max:grade[i];
		}
		String a = "A : ",b = "B : ",c = "C : ",d = "D : ";
		for (int i = 0; i < name.length; i++) {
			if(grade[i]>=max-10){
				a += name[i] + ":" + grade[i]+ " ";
			}else if(grade[i]>=max-20){
				b += name[i] + ":" + grade[i]+ " ";
			}else if(grade[i]>=max-30){
				c += name[i] + ":" + grade[i]+ " ";
			}else{
				d += name[i] + ":" + grade[i]+ " ";
			}
		}
		System.out.println("Max:"+max+"\r\n"+a+"\r\n"+b+"\r\n"+c+"\r\n"+d);
	}
}
