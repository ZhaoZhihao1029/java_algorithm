package search_java;

import java.util.Arrays;

public class binary_search {
	/**
	 * 非递归实现
	 * @param arr
	 * @param item
	 * @return
	 */
	public static boolean binary_search_non_recursive(int[] arr, int item) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == item) {
				return true;
			} else if (arr[mid] > item) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return false;
	}
	
	/**
	 * 递归实现
	 * @param arr
	 * @param item
	 * @return
	 */
	public static boolean binary_search_recursive(int[] arr, int item, int start, int end) {
		if (arr.length == 0 || item < arr[start] || item > arr[end] || start > end) {
			return false;
		}
		int mid = (start + end) / 2;
		if (arr[mid] == item) {
			return true;
		} else if (arr[mid] > item) {
			return binary_search_recursive(arr, item, start, mid - 1);
		} else {
			return binary_search_recursive(arr, item, mid + 1, end);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 8, 13, 17, 19, 32, 42};
		System.out.println(Arrays.toString(arr));
		Boolean result1 = binary_search_non_recursive(arr, 42);
		System.out.println(result1);
		Boolean result2 = binary_search_recursive(arr, 1, 0, arr.length - 1);
		System.out.println(result2);
	}
	
}
