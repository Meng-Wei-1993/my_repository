package com.cj.sep25;
/**
 * һ���˺ܵ�ù����С�Ĵ�����һλ��Ů��һ���Ӽ�����Ϊ���⳥��ѯ���������ж��ټ�����
 * �Ǹ�Ů˵����Ҳ�������ֻ�ǵ�ÿ����������ʣһ����ÿ����3����ʣ2����ÿ����5����ʣ4����
 * ��ÿ������1Ԫ�������æ��̣���������Ӧ�����Ǯ�� Ҫ����ѭ�����ʵ��
 * @author ASUS
 *
 */

public class Task01 {
	public static void main(String[] args) {
		int i = 0;
		while(true){
			if(i%2==1&&i%3==2&&i%5==4){
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}
