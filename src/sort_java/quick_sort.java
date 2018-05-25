package sort_java;

public class quick_sort {

	public static void quick_sort(int[] arr, int left, int right) {
		
		// ！！！！！！！！！！！！递归退出条件！！！！！！！！！！！！！
		if (left >= right) {
			return;
		}

		int mid_value = arr[left];
		int low = left;
		int high = right;
		while (low < high) {
			while (low < high && mid_value <= arr[high]) {
				high -= 1;
			}
			arr[low] = arr[high];
			
			while (low < high && arr[low] < mid_value) {
				low += 1;
			}
			arr[high] = arr[low];
			
		}
		arr[low] = mid_value;

		System.out.print("\n");
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + " ");
		}
		System.out.print("\n");

		quick_sort(arr, left, low - 1);
		quick_sort(arr, low + 1, right);

	}

	public static void main(String[] args) {
		int[] arr = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
		int n = arr.length;
		System.out.println("排序前：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		quick_sort(arr, 0, n - 1);
		System.out.println("排序后：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
