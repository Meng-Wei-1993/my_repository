package com.cj.sep25;
/**
 * 某数学竞赛中，参赛人数大约在380~450人之间。比赛结果，全体考生的总平均分为76分，男生的平均分为75分，女生的平均分为80.1分，求男女生各有多少人？
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
