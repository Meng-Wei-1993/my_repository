package com.cj.sep21;
/**
 * �����ܣ���ĳ��λ����ǧλ������ʮλ���ֵĺ͵��ڰ�λ�������λ���ֵĻ������磬������λ����9512��9+1=5*2����������������λ��֮��
 * @author ASUS
 *
 */

public class Task04 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1000;i<10000;i++){
			if((i/1000+i/10%10)==((i/100%10)*(i%10))){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
