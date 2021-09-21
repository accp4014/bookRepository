package com.java1234.collectionUtil;

import java.util.Scanner;

public class Demo03 {
	public static void main(String [] args) {
//		jiec(20);
//		System.out.print("第5个人"+forAge(5)+"岁");
//		forAge(5);
		flagNum();
	}
	
	public static void jiec(int num) {
		long jiecCount = 0;
		long jiec = 1;
		for(int i =1;i<=num;i++) {
			jiecCount+=jiec*=i;
		}
		System.out.print(num+"的阶乘和为："+jiecCount);
	}
	
	public static long factorial(int num){
        if(num == 1){
            return 1;
        }else{
           return num*factorial(num-1);
        }
    }
	
	public static int age(int num) {
		if(num == 1) {
			return 10;
		}
		return age(num-1)+2;
	}
	
	public static void forAge(int num) {
		int age = 10;
		for(int i =1;i < num;i++) {
			age = age +2;
		}
		System.out.print("第5个人的年龄："+age);
	}
	
	
	public static void flagNum() {
		System.out.print("请输入一个五位数的正整数：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		String strNum = String.valueOf(num);
		char [] charNum = strNum.toCharArray();
		System.out.println("这个正整数的长度为："+charNum.length);
		System.out.println("倒序打印为：");
		for(int i = charNum.length-1;i>=0;i--) {
			System.out.print(charNum[i]+"  ");
		}
	}
}
