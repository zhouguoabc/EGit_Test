package com.zhouguo.test;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[]{9,4,10,6,2,8,13};
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]){
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			System.out.println("github update... 01");
			System.out.println("conflict local");
			System.out.println("conflict remote...");
			System.out.println("conflict2 local");
			System.out.println("conflict2 remote...");
			System.out.println("push test ....");
		}
	}
}
