package com.cj.sep21;
/**
 * 幸运猜猜猜：游戏随机给出一个0~99（包括0和99）的数字，然后让你猜是什么数字。
 * 你可以随便猜一个数字，游戏会提示太大还是太小，从而缩小结果范围。
 * 经过几次猜测与提示后，最终推出答案。在游戏过程中，记录你最终猜对时所需要的次数，游戏结束后公布结果
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
