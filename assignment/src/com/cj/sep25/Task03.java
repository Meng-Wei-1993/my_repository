package com.cj.sep25;
/**
 * �����ܣ���һ����λ����������һ����������ƽ�����Ҹ�λ���ֵĺ���һ��ƽ��������Ƹ���λ�������ǡ���λ˫ƽ������������С�� ����λ˫ƽ������
 * @author ASUS
 *
 */

public class Task03 {
	public static void main(String[] args) {
		for(int i=1000;i<10000;i++){
			if(Math.sqrt(i)-(int)(Math.sqrt(i))==0){
				int a = i/1000+i/100%10+i/10%10+i%10;
				if(Math.sqrt(a)-(int)(Math.sqrt(a))==0){
					System.out.println(i);
					return;
				}
			}
		}
	}
}
