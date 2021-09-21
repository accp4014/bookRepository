package com.java1234.test;

import java.util.Arrays;

public class TestArrays {

	public static void main(String [] args) {
		int [] arr = {2,4,1,6,5};
		System.out.println("展示数组："+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("数组排序："+Arrays.toString(arr));
		System.out.println("二分搜索法："+Arrays.binarySearch(arr, 2));
		Arrays.fill(arr, 0);
		System.out.println("填充数组："+Arrays.toString(arr));
	}
}
