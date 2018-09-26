package com.cj.sep21;
/**
 * 让计算机随机产生10个0到2之间的数， 
如果产生的是0就输出“生成了一只白猪，我好怕怕”， 
如果产生的是1就输出“生成了一只黑猪，我喜欢” 
如果产生的是2就输出“生成了一只红猪，有下酒菜了”

 * @author ASUS
 *
 */

public class Task01 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			int temp = (int)(Math.random()*3);
			if(temp>1){
				System.out.println(temp+":生成了一只红猪，有下酒菜了");
			}else if(temp==1){
				System.out.println(temp+":生成了一只黑猪，我喜欢");
			}else{
				System.out.println(temp+":生成了一只白猪，我好怕怕");
			}
		}
	}
}
