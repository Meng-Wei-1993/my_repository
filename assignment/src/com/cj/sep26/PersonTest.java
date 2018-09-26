package com.cj.sep26;
/**
 * 编写一个Java Application程序，名字自己定义，换行输出你的姓名、年龄、性别、班级。
 * @author MengWei 2018年9月26日
 */

public class PersonTest {
	public static void main(String[] args) {
		Person per = new Person("jack", 18, "male", "Two class three grade");
		System.out.println(per);
	}
}
