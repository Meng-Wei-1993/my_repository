package com.cj.sep21;
/**
 * ���˲²²£���Ϸ�������һ��0~99������0��99�������֣�Ȼ���������ʲô���֡�
 * ���������һ�����֣���Ϸ����ʾ̫����̫С���Ӷ���С�����Χ��
 * �������β²�����ʾ�������Ƴ��𰸡�����Ϸ�����У���¼�����ղ¶�ʱ����Ҫ�Ĵ�������Ϸ�����󹫲����
 */

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		int target = (int)(Math.random()*100);
		int count = 0;
		int guess = 0;
		Scanner scan = new Scanner(System.in);
		while(true){
			if(count==0){
				System.out.println("Game Begin!");
				System.out.println("input:");
			}else{
				if(guess>target){
					System.out.println("Your guess is bigger than target.\r\ncontinue input:");
				}else{
					System.out.println("Your guess is smaller than target.\r\ncontinue input:");
				}
			}
			guess = Integer.parseInt(scan.nextLine());
			count++;
			if(guess==target||count==20){
				break;
			}
		}
		scan.close();
		if(guess!=target){
			System.out.println("Stupid!");
			return;
		}
		if(count<2){
			System.out.println("Talent!!!");
		}else if(count<7){
			System.out.println("So good!");
		}else{
			System.out.println("Continuing efforts.");
		}
	}
}
