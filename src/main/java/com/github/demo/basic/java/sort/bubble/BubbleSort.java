/**
 * 
 */
package com.github.demo.basic.java.sort.bubble;

import java.util.Arrays;

/**
 * @author liush
 * 冒泡排序算法
 * 算法描述：设为从小到大排序
 * 1.从第一个数起，依次与相邻元素比较，如果大于后一个元素，则交换，这样，一轮下来，
 * 最大的数就置换到最后的位置了。
 * 2.重复以上过程，直到所有元素有序为止。
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int [] array = {3,5,2,7,9,5,8,4};
		System.out.println("排序前数组：" + Arrays.toString(array));
		// 排序
		sort(array);
		System.out.println("排序后数组: "+Arrays.toString(array));

	}

	public static void sort(int [] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j] > a[j+1]){
					swap(a,j,j+1);
				}
			}
		}
	}
	
	public static void swap(int [] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
