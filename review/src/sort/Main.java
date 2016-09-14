package sort;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] arr = {10,2,5,36,0,8,7,15};
		//selectSort(arr);
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 选择排序
	 * @param arr
	 */
	public static void selectSort(int[] arr){
		for(int i = 0;i<arr.length - 1;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	/**
	 * 冒泡排序
	 * @param arr
	 */
	public static void bubbleSort(int[] arr){
		for(int i = 0;i<arr.length - 1;i++){
			for(int j = 0;j<arr.length-i-1;j++){
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
