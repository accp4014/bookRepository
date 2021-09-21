package com.java1234.test;

public class Test {

	public static void main(String [] args) {
		//向上转型
		Penson penson = new Student();
		penson.say();
		
		penson = new Teacher();
		penson.say();
		
		//向下转型
		try {
			Student stu = (Student) penson;
			stu.say();
		}catch(Exception e) {
			new CustomeException("自定义异常");
		}
		
	}
}
