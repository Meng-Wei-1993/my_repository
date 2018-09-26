package com.cj.sep25;
/**
 * 定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，
 * 统计各成绩等级（90分以上为‘A’，80~89分为‘B’，70~79分为‘C’，60~69分为‘D’，60分以下为E）学生人数，
 * 并将其放入到数组count中，其中：count[0]存E级的人数，count[1]存D级的人数，……，count[4]存A级的人数
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
