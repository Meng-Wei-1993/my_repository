package com.cj.sep21;
/**
 * �Ӽ��̶���ѧ���ɼ����ҳ���߷֣������ѧ���ɼ��ȼ���
�ɼ�>=��߷�-10    �ȼ�Ϊ��A��   
�ɼ�>=��߷�-20    �ȼ�Ϊ��B��
�ɼ�>=��߷�-30    �ȼ�Ϊ��C��   
����               �ȼ�Ϊ��D��
��ʾ���ȶ���ѧ��������������������int���飬���ѧ���ɼ�

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
