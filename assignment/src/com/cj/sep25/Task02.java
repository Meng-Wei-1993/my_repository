package com.cj.sep25;
/**
 * ĳ��ѧ�����У�����������Լ��380~450��֮�䡣���������ȫ�忼������ƽ����Ϊ76�֣�������ƽ����Ϊ75�֣�Ů����ƽ����Ϊ80.1�֣�����Ů�����ж����ˣ�
 * @author ASUS
 *
 */

public class Task02 {
	public static void main(String[] args) {
		for(int i=380;i<=450;i++){
			double sum = i*76;
			for(int j=0;j<=i;j++){
				if(80.1==(sum-(75*j))/(i-j)){
					System.out.println("man:"+j+"womam:"+(i-j));
				}
			}
		}
	}
}
