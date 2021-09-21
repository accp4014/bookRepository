package com.java1234.collectionUtil;

public class HelloWord {
	public static void main(String [] args){
		outStr();
	}
	
	public static void shuixh() {
		System.out.println("100~999之间的水仙花数有：");
		outer:
		for(int i =100;i<=999;i++) {
			if(isFlag(i)) {
				System.out.print(i+"  ");
			}
			if(i==400) {
				break outer;
			}
		}
	}
	public static boolean isFlag(int i) {
		int b = i/100;
		int s = (i-b*100)/10;
		int g = i -b*100-s*10;
		if(b*b*b+s*s*s+g*g*g == i) {
			return true;
		}
		return false;
	}
	
	public static void maopao() {
		int [] arr = {4,21,0,-12,-3};
		int temp;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i = 0; i <arr.length;i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	
	public static void chengfTable() {
		for(int i = 1;i<=9;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
	}
	
	public static void jiaoh() {
		int i = 12,j =15,b = 9;
		int [] arr = {i,j,b};
		int maxValue = arr[0];
		int minValue = arr[0];
		for(int t = 0 ; t < arr.length;t++) {
			if(arr[t] > maxValue) {
				maxValue = arr[t];
			}
			if(arr[t] < minValue) {
				minValue = arr[t];
			}
		}
		System.out.print("最大值："+maxValue+", 最小值："+minValue);
	}
	
	public static void sum() {
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			sum+=i;
		}
		System.out.print("1~100的和为："+sum);
	}
	
	public static void jiec() {
		long count = 1;
		long sum = 0;
		for(int i = 1;i<=10;i++) {
			count*=i;
			sum +=count;
		}
		System.out.print("1~10的阶乘和为："+sum);
	}
	
	public static void qNumCount() {
		int [] arr = {0,1,2,3,4,5,6,7,8,9,10,11};
		int qCount = 0;
		int oCount = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == 0) {
				
			}else if(arr[i]%2==0) {
				oCount++;
			}else {
				qCount++;
			}
		}
		System.out.print("奇数总数："+qCount+" ,偶数总数："+oCount);
	}
	
	public static void arr() {
		int count = 0;
		int oldArr []={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		for(int i = 0;i<oldArr.length;i++) {
			if(oldArr[i] != 0) {
				count++;
			}
		}
		int [] newArr = new int[count];
		int j =0;
		for(int i = 0;i<oldArr.length;i++) {
			if(oldArr[i] != 0) {
				newArr[j] = oldArr[i];
				j++;
			}
		}
		for(int t = 0; t< newArr.length;t++) {
			System.out.print(newArr[t]);
		}
	}
	
	public static void outStr() {
		String str = "abcdefg";
		char [] cStr = str.toCharArray();
		for(int i = cStr.length-1;i>=0;i--) {
			System.out.print(cStr[i]);
		}
	}
}
