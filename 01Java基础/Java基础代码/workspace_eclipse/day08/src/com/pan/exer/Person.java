package com.pan.exer;
/*
 * 1.创建Person类的对象，
 * 设置该对象的name、 age和sex属性
 */
public class Person {
	String name;
	int age;
	/**
	 * sex:0表示女性；
	 * sex:1表示男性。
	 */
	int sex;
	
/*
 * 2.调用study方法，输出字符串 “studying”
 */
	public void study() {
		System.out.println("Studying!");
	}
	
/*
 * 3.调用showAge方法，显示age值
*/	
	public void showAge() {
		System.out.println("Age is " + age);
	}
/*
 * 3.调用 addAge()方法给对象的age属性值增加2岁。

 */
	public int addAge(int i) {
		age +=i;
		return age;
	}
	

}
