package com.cj.sep21;
/**
 * �ü�����������10��0��2֮������� 
�����������0�������������һֻ�����Һ����¡��� 
�����������1�������������һֻ������ϲ���� 
�����������2�������������һֻ�������¾Ʋ��ˡ�

 * @author ASUS
 *
 */

public class Task01 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			int temp = (int)(Math.random()*3);
			if(temp>1){
				System.out.println(temp+":������һֻ�������¾Ʋ���");
			}else if(temp==1){
				System.out.println(temp+":������һֻ������ϲ��");
			}else{
				System.out.println(temp+":������һֻ�����Һ�����");
			}
		}
	}
}
