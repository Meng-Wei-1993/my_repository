package com.cj.sep21;
/**
 * ��һ����λ�������������ǰ����һ��3���ɵõ�һ����λ������3�������ĺ��棬Ҳ���Եõ�һ����λ������������λ�����468����ԭ������λ����
 * @author ASUS
 *
 */

public class Task02 {
	public static void main(String[] args) {
		for(int i=10;i<100;i++){
			int a = i+300;
			int b = 10*i +3;
			if(a-b==468||b-a==468){
				System.out.println(i);
			}
		}
	}
}
