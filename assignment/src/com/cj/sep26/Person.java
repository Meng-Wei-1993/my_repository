package com.cj.sep26;

public class Person {
	
	String name = "jack";
	int age = 18;
	String gender = "male";
	String clazz = "one";
	
	public Person(String name, int age, String gender, String clazz) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender
				+ ", clazz=" + clazz + "]";
	}
}
