package jeffutils;

import apcs.Window;

public class arr {
	public static void printArr(int[] array,int start, int end) {
		if (start > end) {
			for (int i = start; i > end; i --) {
				System.out.println(array[i]);
			}
		} else {
			for (int i = start; i < end + 1; i ++) {
				System.out.println(array[i]);
			}
		}
		
	}
	public static void swap(int[] array, int i, int i2) {
		int temp = array[i2];
		array[i2] = array[i];
		array[i] = temp;
	}
	public static int[] randomArray(int length, int min, int max) {
		int[] array = new int[length];
		for (int i = 0; i < length; i ++) {
			array[i] = Window.random(min, max);
		}
		return array;
		
	}
	public static int sum(int[] array, int start, int end) {
		int sum = 0;
		if (start > end) {
			int temp = end;
			end = start;
			start = temp;
		} else {
			for (int i = start; i < array.length; i ++) {
				sum += array[i];
			}
		}
		
		return sum;
	}
	public static void printArr(int[] array) {
		for (int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}
		
	}
	public static void printArrReverse(int[] array) {
		for (int i = array.length - 1; i > 0; i --) {
			System.out.println(array[i]);
		}
		
	}
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i ++) {
			sum += array[i];
		}
		return sum;
		
	}
	public static int greatst(int[] array) {
		int greatist = array[0];
		for (int i = 0; i < array.length; i ++) {
			if (greatist < array[i]) {
				greatist = array[i];
			}
		}
		return greatist;
		
	}
	public static int smallestIndex(int[] array, int start) {
		int least = start;
		for (int i = start; i < array.length; i ++) {
			if (array[least] > array[i]) {
				least = i;
			}
		}
		return least;
		
	}
	public static int smallestIndex(int[] array) {
		int least = 0;
		for (int i = 0; i < array.length; i ++) {
			if (least > array[i]) {
				least = i;
			}
		}
		return least;
		
	}
	public static int smallest(int[] array, int start) {
		int least = array[start];
		for (int i = start - 1; i > 0; i --) {
			if (array[i] < least) {
				least = array[i];
			}
		}
		return least;
		
	}
	public static int smallest(int[] array) {
		int least = array[0];
		for (int i = 0; i < array.length; i ++) {
			if (least > array[i]) {
				least = array[i];
			}
		}
		
		return least;
		
	}
	/*
	public static int[] section(int[] array, int start, int end) {
		
		if (start > end) {
			int temp = end;
			end = start;
			start = temp;
		}
		int[] result = new int[end - start];
		for (int i = start - 1; i < end; i ++) {
			result[i] = array[i];
		}
		return result;
		
	}
	*/
}
