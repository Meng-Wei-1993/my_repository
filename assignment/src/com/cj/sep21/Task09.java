package com.cj.sep21;
/**
 * 从键盘输入8个整数存放在一个数组中，然后将奇数和偶数分别存入到两个不同的数组中，并按奇数、偶数交替的顺序输出这两个数组中的所有数据
 * @author ASUS
 *
 */
public class Task09 {
	public static void main(String[] args) {
		int[] oldArray = new int[8];
		int[] newArray = new int[8];
		int s = 0;
		for (int i = 0; i < oldArray.length; i++) {
			oldArray[i] = (int)(Math.random()*10+1);
			if(oldArray[i]%2==1){
				s++;
			}
		}
		int[] sArray = new int[s];
		int[] dArray = new int[8-s];
		int sIndex=0,dIndex=0;
		for (int i = 0; i < oldArray.length; i++) {
			if(oldArray[i]%2==1){
				sArray[sIndex++] = oldArray[i];
			}else {
				dArray[dIndex++] = oldArray[i];
			}
		}
		System.out.print("OldArray : ");
		for (int i = 0; i < oldArray.length; i++) {
			System.out.print(oldArray[i]+" ");
		}
		System.out.print("\r\nsArray : ");
		for (int i = 0; i < sArray.length; i++) {
			System.out.print(sArray[i]+" ");
		}
		System.out.print("\r\ndArray : ");
		for (int i = 0; i < dArray.length; i++) {
			System.out.print(dArray[i]+" ");
		}
		for (int i = 0; i < 2*(s<4?s:8-s); i++) {
			if(i%2==0){
				newArray[i] = sArray[i/2];
			}else{
				newArray[i] = dArray[i/2];
			}
		}
		int sCopy1 = 2*s;
		int sCopy2 = 2*(8-s);
		if(s==4){
		}else if(s<4){
			for (int i = s; i < dArray.length; i++) {
				newArray[sCopy1++] = dArray[i];
			}
		}else{
			for (int i = 8-s; i < sArray.length; i++) {
				newArray[sCopy2++] = sArray[i];
			}
		}
		System.out.print("\r\nnewArray : ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+" ");
		}
	}
}
