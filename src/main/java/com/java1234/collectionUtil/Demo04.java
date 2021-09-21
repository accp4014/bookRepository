package com.java1234.collectionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo04 {

	private static double sum = 0;    //求和

    private static String str = "";   //拼接字符串
	
	public static void main(String [] args) {
//		outArray();
//		devition();
//		numGame();
//		outStr();
//		fun();
		strOrder();
	}
	
	public static void qiuNum() {
		System.out.println("请输入一个8位数的整数:");
		Scanner scann = new Scanner(System.in);
		int num = scann.nextInt();
		scann.close();
		char [] strNum = (num+"").toCharArray();
		int j = 0;
		char [] str = new char [strNum.length];
		for(int i = strNum.length-1;i>=0;i--) {
			str[j] = strNum[i];
			++j;
		}
		System.out.println("从右端取后的第四位到第七位是："+str[3] +" "+str[4] +" "+str[5] +" "+str[6] +" ");
	}
	
	
	public static void outArray() {
		int [] num = {8,4,5,1,2,9};
		int max = 6;
		int min = 6;
		int maxIndex = 0;
		int minIndex = 0;
		for(int i = 0;i < num.length;i++) {
			if(num[i] > max) {
				max = num[i];
				maxIndex = i;
			}
			if(num[i] < min) {
				min = num[i];
				minIndex = i;
			}
		}
		int i = num[0];
		num[0] = max;
		num[maxIndex] = i;
		int j = num[num.length-1];
		num[num.length-1] = min;
		num[minIndex] = j;
		
		for(int k = 0;k < num.length;k++) {
			System.out.print(num[k] + " ");
		}
	}
	
	public static void devition() {
		int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		printArray(num);
		int m = 6;
		int [] newArr = new int[m];
		int count = m -1;
		for(int i = num.length-1;i>=num.length-m;i--) {
			newArr[count--] = num[i];
		}
		for(int i = num.length-1;i >= m;i--) {
			num[i] = num[i-m];
		}
		for(int i = 0;i<newArr.length;i++) {
			num[i] = newArr[i];
		}
		System.out.println("/n=================");
		printArray(num);
		
	}
	public static void printArray(int [] array) {
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i] + "  ");
		}
	}
	
	
	
	
	public static void numGame() {
		System.out.println("请输入需要参加游戏的人数：");
		Scanner scan = new Scanner(System.in);
		int pensonNum = scan.nextInt();
		scan.close();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<=pensonNum;i++) {
			list.add(i);
		}
		forGame(list,1);
	}
	
	public static void forGame(List<Integer> list,int idex) {
		List<Integer> listTemp = new ArrayList<Integer>();
		if(list != null && list.size() > 0) {
			if(list.size() >= 3) {
				for(int i = 0; i <list.size();i++) {
					if((i+idex) % 3 != 0) {
						listTemp.add(list.get(i));
					}
				}
				forGame(listTemp,list.size()%3+1);
			}else {
				for(int i = 0; i < list.size();i++) {
					System.out.println("最后留下的选手为："+list.get(i));
				}
			}
		}
	}
	
	
	public static void outStr() {
		
		System.out.println("输入一个字符串：");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char [] strs = str.toCharArray();
		for(int i = 0; i < strs.length;i++) {
			System.out.print(strs[i] + "  ");
		}
		System.out.println();
		System.out.print("该字符的长度为："+strs.length);
	}
	
	public static void fun() {
		
		System.out.println("请输入一个整数：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
//		double count = 0.000;
//		if(num == 0) {
//			System.out.print("0既不是奇书也不是偶数");
//		}
//		int [] nums = new int[num];
//		for(int i = 1; i <= num;i++) {
//			nums[i-1] = i;
//		}
//		
//		for(int i = 0; i < nums.length;i++) {
//			if(nums[i] % 2 == 0) {
//				count +=ouFun(nums[i]);
//			}
//		}		
//		System.out.print("函数求出的值为："+count);
		specialDeal(num);
		System.out.print(str.substring(0,str.length()-2)+"的和为：");
        System.out.println(sum);
	}
	
	public static double ouFun(int num) {
		System.out.print("1.0 /"+num+"+ ");
		return 1.0/num;
	}
	public static double jiFun(int num) {
		return 1.0/(num*2+1);
	}
	
	
	private static void specialDeal(int num) {
        sum = sum+ 1.0/num;
        if(num > 2){
            specialDeal(num-2);
        }
        str = str+"1/"+num+" + ";
    }
	
	public static void strOrder() {
		String [] strs = {"asd","bbb","dddd","add","eddd","ccdd","caaa","adds","cvf","dass"};
		System.out.print("初始化数组：");
		printStrArray(strs);
		strOrderAfter(strs);
	}
	
	public static void strOrderAfter(String [] array) {
		for(int i = 0; i < array.length;i++) {
			for(int j = i+1;j < array.length;j++) {
				String tmp = "";
				if(array[i].compareTo(array[j]) > 0) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.print("排序后的字符串数组为：");
		printStrArray(array);
	}
	
	public static void printStrArray(String [] array) {
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i] + "  ");
		}
	}
}
