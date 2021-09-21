package com.java1234.collectionUtil;

import java.util.Scanner;

public class CollectionUtils {

	public static void main(String [] args) {
		/**
		 * 判断101-200之间有多少个素数
		 */
//		primNumber();
		/**
		 * 判断是否是水仙花数
		 */
//		narcissus();
		
		/**
		 * 利用条件运算符的嵌套来完成此题：
		 * 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
		 */
		subScore();
		
		
	}
	
	public static void subScore() {
		System.out.println("请输入学生成绩：");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		scan.close();
		String scoreavg = (score >= 90)?"A":(60 <= score && score < 90 ?"B":"C");
		System.out.print("成绩评级为："+scoreavg);
	}
	
	public static void narcissus(){
		System.out.print("水仙花数：");
		for(int i = 100;i <= 999; i ++) {
			if(isNarcissus(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isNarcissus(int n) {
		int num1 = 0; //个位
		int num2 = 0; //十位
		int num3 = 0; //百位
		num3 = n / 100;
		num2 = (n - num3*100) / 10;
		num1 = n - num3*100 - num2*10;
		if(Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3) == n) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void primNumber() {
		int primNumberCount = 0;
		System.out.print("素数：");
		for(int i = 101;i < 200;i++) {
			if(isPrimNumber(i)) {
				primNumberCount++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\n总共有"+primNumberCount+"个素数");
	}
	/**
	 * 判断一个数是否是素数
	 * @param n
	 * @return
	 */
	public static boolean isPrimNumber(int n) {
		if(n < 2) {
			return false;
		}else if(n % 2 == 0) {
			return false;
		}
		for(int i = 3; i < n;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
