package com.java1234.collectionUtil;

import java.util.Scanner;

public class CollectionUtilDemo02 {
	
	public static void main(String [] args) {
//		formThreeNum();
//		money();
//		dayNum("2020-04-12");
		
//		minNum(11,3,2);
//		chengfb();
//		System.out.print("一共有"+peachNum(10)+"个桃子");
		diamond(6);
	}
	
	/**
	 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
	 */
	public static void formThreeNum() {
		System.out.print("可以组成的三位数字有：");
		for(int i = 1;i<=4;i++) {
			for(int j = 1;j<=4;j++) {
				for(int k = 1;k <=4;k++) {
					if(i != j && j != k && k != i) {
						System.out.print(i+""+j+ ""+k +"  ");
					}
				}
			}
		}
	}
	
	
	public static void money() {
		System.out.println("请输入获取的利润：");
		Scanner sacn = new Scanner(System.in);
		int money = sacn.nextInt();
		sacn.close();
		double count = 0;
		if(money<=10) {
			count = money*0.1;
		}else if(money >10 && money <= 20) {
			count = money*0.075;
		}else if(money >20 && money <= 40) {
			count = money*0.05;
		}else if(money >40 && money <= 60) {
			count = money*0.03;
		}else if(money >60 && money <= 100) {
			count = money*0.015;
		}else if(money >100) {
			count = money*0.01;
		}
		System.out.print(count+"万元");
	}
	
	public static void dayNum(String date) {
		String [] dateStr = date.split("-");
		int dayNum = 0;
		if(leapYear(dateStr[0])) {
			dayNum = month(dateStr[1],"0") + Integer.parseInt(dateStr[2]);
		}else {
			dayNum = month(dateStr[1],"1") + Integer.parseInt(dateStr[2]);
		}
		System.out.print("这是"+dateStr[0]+"年的第"+dayNum+"天");
	}
	public static boolean leapYear(String year) {
		int years = Integer.parseInt(year);
		if((years % 4 == 0 && years % 100 !=0) || years % 400 ==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int month(String month,String flag) {
		int dayNum = 0;
		switch(month) {
		case "01":
			dayNum = 0;
			break;
		case "02":
			dayNum = month("01",flag)+31;
			break;
		case "03":
			if("0".equals(flag)) {
				dayNum = month("02",flag) + 28;
			}else {
				dayNum = month("02",flag) + 29;
			}
			break;
		case "04":
			dayNum = month("03",flag) + 31;
			break;
		case "05":
			dayNum = month("04",flag) + 30;
			break;
		case "06":
			dayNum = month("05",flag) + 31;
			break;
		case "07":
			dayNum = month("06",flag) + 30;
			break;
		case "08":
			dayNum = month("07",flag) + 31;
			break;
		case "09":
			dayNum = month("08",flag) + 30;
			break;
		case "10":
			dayNum = month("09",flag) + 31;
			break;
		case "11":
			dayNum = month("10",flag) + 30;
			break;
		case "12":
			dayNum = month("11",flag) + 31;
			break;
		}
		return dayNum;
	}
	
	public static void minNum(int a,int b,int c) {
		int tmp = 0;
		int [] num = {a,b,c};
		for(int i =0;i<num.length;i++) {
			for(int j = i+1;j<=2;j++) {
				if(num[j]<num[i]) {
					tmp = num[j];
					num[j] = num[i];
					num[i] = tmp;
				}
			}
		}
		for(int i = 0;i < num.length;i++) {
			System.out.print(num[i] +"  ");
		}
	}
	
	
	
	public static void chengfb() {
		for(int i =1;i<=9;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(j*i + "   ");
			}
			System.out.println();
		}
	}
	
	public static int peachNum(int dayNum) {
		if(dayNum == 1) {
			return 1;
		}
		return (peachNum(dayNum -1)+1) * 2;
	}
	
	public static void diamond(int a) {
		for(int i = a;i >= 0;i--) {
			for(int j = 0; j < i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j <a-i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i =0;i < a;i++) {
			for(int j =0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j =0;j<a-i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
