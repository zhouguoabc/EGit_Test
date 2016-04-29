package com.zhouguo.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionTest {

	@Test
	public void test() {
		int[] arr = new int[]{12,8,13,2,6,1,15,21};
		for (int i = 0; i < arr.length - 1; i++) {
			int num = i;
			for (int j = i; j < arr.length; j++) {
				if(arr[num] > arr[j]){
					num = j;
				}
			}
			if(num != i){
				int tmp = arr[num];
				arr[num] = arr[i];
				arr[i] = tmp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
