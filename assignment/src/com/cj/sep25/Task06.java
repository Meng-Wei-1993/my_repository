package com.cj.sep25;
/**
 * ����һ���������洢12��ѧ���ĳɼ�{72,89,65,58,87,91,53,82,71,93,76,68}��
 * ͳ�Ƹ��ɼ��ȼ���90������Ϊ��A����80~89��Ϊ��B����70~79��Ϊ��C����60~69��Ϊ��D����60������ΪE��ѧ��������
 * ��������뵽����count�У����У�count[0]��E����������count[1]��D����������������count[4]��A��������
 * @author ASUS
 *
 */

public class Task06 {
	public static void main(String[] args) {
		int[] arr = {72,89,65,58,87,91,53,82,71,93,76,68};
		int[] count = new int[5];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<60){
				count[4]++;
			}else if(arr[i]<70){
				count[3]++;
			}else if(arr[i]<80){
				count[2]++;
			}else if(arr[i]<90){
				count[1]++;
			}else{
				count[0]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i]+" ");
		}
	}
}
